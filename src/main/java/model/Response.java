package model;


public class Response {
    private Integer msgId;
    private String msgTitle;
    private String mggBody;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMggBody() {
        return mggBody;
    }

    public void setMggBody(String mggBody) {
        this.mggBody = mggBody;
    }

    public Response(Integer msgId, String msgTitle, String mggBody) {
        this.msgId = msgId;
        this.msgTitle = msgTitle;
        this.mggBody = mggBody;
    }
}
