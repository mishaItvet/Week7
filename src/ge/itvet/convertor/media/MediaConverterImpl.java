package ge.itvet.convertor.media;

public class MediaConverterImpl extends MediaConverter {

    private boolean flag = false;


    public MediaConverterImpl(MediaType type, Media mediaFile) {
        super(type, mediaFile);
    }

    public void convert() {
        mediaFile.setType(type);
        flag = true;
    }

    @Override
    public String info() {
        return flag ? "დაკონვერტირდა" : "ჯერ არ დაკონვერტირებულა";
    }
}
