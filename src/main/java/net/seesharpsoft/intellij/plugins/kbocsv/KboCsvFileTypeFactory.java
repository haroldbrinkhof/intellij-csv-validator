package net.seesharpsoft.intellij.plugins.kbocsv;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class KboCsvFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(KboCsvFileType.INSTANCE, String.join(FileTypeConsumer.EXTENSION_DELIMITER, new String[] {"kbocsv"}));
    }
}