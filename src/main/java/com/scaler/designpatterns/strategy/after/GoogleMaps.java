package com.scaler.designpatterns.strategy.after;

import com.scaler.designpatterns.strategy.after.pathcalculatorstrategy.PathCalculatorStrategy;
import com.scaler.designpatterns.strategy.after.pathcalculatorstrategy.PathCalculatorStrategyFactory;

public class GoogleMaps {

    public void findPath(String from, String to, Mode mode) {
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorStrategyFactory
                .getStrategy(mode);
        pathCalculatorStrategy.findPath(from, to);
    }
}
