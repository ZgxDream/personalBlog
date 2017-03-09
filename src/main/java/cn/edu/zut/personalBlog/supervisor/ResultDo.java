package cn.edu.zut.personalBlog.supervisor;

/**
 * Created by zgx on 16/03/.
 */
public class ResultDo<T> {
    private boolean success = false;
    private String message = null;
    private T result = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultDo{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
