package com.nftbe.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public abstract class BaseData {
    protected static final Logger logger = LoggerFactory.getLogger(BaseData.class);
    protected static final Marker marker = MarkerFactory.getMarker(BaseData.class.getName());
}
