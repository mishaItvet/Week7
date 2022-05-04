package ge.itvet.convertor.media;


import ge.itvet.convertor.Convertable;

public abstract class MediaConverter implements Convertable {
    protected MediaType type;
    protected Media mediaFile;

    public MediaConverter(MediaType type, Media mediaFile) {
        this.type = type;
        this.mediaFile = mediaFile;
    }

    public Media getMediaFile() {
        return mediaFile;
    }
    public abstract String info();
}
