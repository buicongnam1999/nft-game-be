package com.nftbe.services;

import com.nftbe.models.Nft;
import com.nftbe.parsers.NftParser;
import com.nftbe.repositories.INftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.nftbe.utils.Constants.EMPTY;

@Service
public class NftService implements IBaseService<Nft> {
    @Autowired
    private INftRepository nftRepository;

    @Override
    public List<Nft> getAll() {
        return nftRepository.findAll();
    }

    @Override
    public Nft findById(int id) {
        return null;
    }

    @Override
    public Nft update(Nft nft) {
        if (Objects.isNull(nft)) {
            return null;
        }

        Optional<Nft> foundNft = nftRepository.findById(nft.getId());
        if (foundNft.isPresent()) {
            int skillId = nft.getSkillId();
            Nft nftFounded = foundNft.orElse(null);
            if (!EMPTY.equals(skillId)) {
                nftFounded.setSkillId(skillId);
                nftRepository.save(nftFounded);
                return nftFounded;
            }
        }
        return null;
    }

    @Override
    public Nft create(Nft nft) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Nft> getByPage(int page) {
        int pageSize = 8;
        Pageable pageable = PageRequest.of(page, pageSize);
        return nftRepository.findAll(pageable).getContent();
    }

    public List<Nft> sortPrice(int type) {
        List<Nft> nfts = getAll();
        if (type > 0) {
            Collections.sort(nfts, (o1, o2) -> o1.getNftDateCreate().compareTo(o2.getNftDateCreate()));
            return nfts;
        }

        return null;
    }
}
