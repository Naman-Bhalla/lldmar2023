package com.scaler.tictactoe.strategies.botplayingstrategies;

import com.scaler.tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel level) {
        return new EasyBotPlayingStrategy();
    }
}
