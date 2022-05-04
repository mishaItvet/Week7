package ge.itvet.convertor.media;

public class Media {
    private MediaType type;

    public Media(MediaType type) {
        this.type = type;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

}
