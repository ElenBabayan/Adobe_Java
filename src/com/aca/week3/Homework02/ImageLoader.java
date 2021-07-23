package com.aca.week3.Homework02;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ImageLoader extends LineProgressAware {

    private final URL url;
    private boolean isLoaded = false;


    public ImageLoader(int lineLength, URL url) {
        super(lineLength);
        this.url = url;
    }

    public void load() throws IOException, InterruptedException {

        if(isImageLoaded()){
            System.out.println("Error: Already loaded");
            return;
        }
        showProgress(5);
        loadImage();
        isLoaded = true;
    }

    private void  loadImage() throws IOException {
        BufferedImage img = ImageIO.read(url);
        System.out.println("Image loaded: " + img.createGraphics());
    }

    public boolean isImageLoaded() {
        return isLoaded;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        URL url = new URL("https://source.unsplash.com/random/200x200?sig=1");

        ImageLoader imageLoader = new ImageLoader(500, url);
        imageLoader.load();
    }

}
