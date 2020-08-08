package net.seesharpsoft.intellij.plugins.kbocsv;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public final class KboCsvFileType extends LanguageFileType {
    public static final KboCsvFileType INSTANCE = new KboCsvFileType();

    public static final Icon ICON = IconLoader.getIcon("/media/icons/kbo-icon.png");

    private KboCsvFileType() {
        super(KboCsvLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "KBOCSV";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "KBOCSV file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "kbocsv";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ICON;
    }
}