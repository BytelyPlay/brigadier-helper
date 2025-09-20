package org.bytelyplay.brigadierHelpers.utils;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import org.bytelyplay.brigadierHelpers.commands.Command;

import java.util.ArrayList;

public class Commands<T> {
    private final CommandDispatcher<T> dispatcher;
    public Commands(CommandDispatcher<T> dispatcher) {
        this.dispatcher=dispatcher;
    }

    public void register(Command<T> cmd) {
        LiteralArgumentBuilder<T> builder = cmd.build();

        dispatcher.register(builder);
    }
}
