package edu.gcit.to_do_18;

public class sports {
    private  String title;
    private String info;
    int imageResources;

    public sports(String title, String info, int imageResources) {
        this.title = title;
        this.info = info;
        this.imageResources = imageResources;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResources()
    {
        return imageResources;
    }
}
