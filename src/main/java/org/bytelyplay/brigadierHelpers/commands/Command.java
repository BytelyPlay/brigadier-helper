package org.bytelyplay.brigadierHelpers.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public interface Command<T> {
    @NotNull LiteralArgumentBuilder<T> build();
}
