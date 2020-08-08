package net.seesharpsoft.intellij.plugins.kbocsv;

import com.intellij.lang.Language;
import net.seesharpsoft.intellij.plugins.csv.CsvLanguage;
import net.seesharpsoft.intellij.plugins.csv.CsvNonExistentFieldGenerationHolder;

public final class KboCsvLanguage extends Language implements CsvNonExistentFieldGenerationHolder {
    public static final KboCsvLanguage INSTANCE = new KboCsvLanguage();

    private KboCsvLanguage() {
        super(CsvLanguage.INSTANCE, "kbocsv");
    }

    @Override
    public String getDisplayName() {
        return "KBOCSV";
    }

    @Override
    public boolean isNonExistentFieldGenerationAllowed() {
        return false;
    }
}
