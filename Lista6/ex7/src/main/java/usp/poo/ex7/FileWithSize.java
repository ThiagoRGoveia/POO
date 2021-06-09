package usp.poo.ex7;

import java.io.File;

// Classe que guarda o arquivo e seu tamanho, será utilizada para ordenar
// a ArrayList de arquivos
public class FileWithSize implements Comparable<FileWithSize> {
    public File file;
    public long size;

    public FileWithSize(File file, long size){
        this.file = file;
        this.size = size;
    }

    @Override
    public int compareTo(FileWithSize o) {
        return size < o.size ? -1 : 1;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", file.getName(), size);
    }
}
