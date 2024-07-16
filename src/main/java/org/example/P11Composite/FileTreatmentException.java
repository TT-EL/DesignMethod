package org.example.P11Composite;

/**
 * 表示向文件中增加Entry时发生异常的类
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
