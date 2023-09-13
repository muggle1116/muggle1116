package exception;

public class FileException extends RuntimeException{
    private String errMessage;
    public FileException(){
        super();
    }
    public FileException(String errMessage){
        super(errMessage);
        this.errMessage=errMessage;
    }
    public String getMessage(){
        return errMessage;
    }
    public static void handle(){
        throw new FileException("仅支持读取txt类型文件");
    }
}
