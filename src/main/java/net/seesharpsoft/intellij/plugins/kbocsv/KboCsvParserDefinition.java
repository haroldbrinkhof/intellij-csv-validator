package net.seesharpsoft.intellij.plugins.kbocsv;

import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import net.seesharpsoft.intellij.plugins.csv.CsvParserDefinition;
import net.seesharpsoft.intellij.plugins.csv.psi.CsvFile;
import net.seesharpsoft.intellij.plugins.csv.psi.CsvFileElementType;

public class KboCsvParserDefinition extends CsvParserDefinition {
    public static final IFileElementType KBOCSV_FILE = new CsvFileElementType(KboCsvLanguage.INSTANCE);

    @Override
    public IFileElementType getFileNodeType() {
        return KBOCSV_FILE;
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new CsvFile(viewProvider, KboCsvFileType.INSTANCE);
    }
}
