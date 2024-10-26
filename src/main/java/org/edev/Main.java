package org.edev;


import com.github.kiulian.downloader.YoutubeDownloader;
import com.github.kiulian.downloader.downloader.request.RequestVideoFileDownload;
import com.github.kiulian.downloader.downloader.request.RequestVideoInfo;
import com.github.kiulian.downloader.downloader.response.Response;
import com.github.kiulian.downloader.model.videos.VideoDetails;
import com.github.kiulian.downloader.model.videos.VideoInfo;
import com.github.kiulian.downloader.model.videos.formats.Format;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        try{

            YoutubeDownloader downloader = new YoutubeDownloader();
            //Set an youtube id video here
            RequestVideoInfo requestVideoInfo = new RequestVideoInfo("");
            Response<VideoInfo> response = downloader.getVideoInfo(requestVideoInfo);
            VideoInfo videoInfo = response.data();

            VideoDetails details = videoInfo.details();
            System.out.println("Downloading"+ details.title());
            File outPutDir = new File("my_videos");
            if (!outPutDir.exists()){
                outPutDir.mkdirs();
            }
            Format format = videoInfo.bestVideoWithAudioFormat();
         RequestVideoFileDownload requestVideoFileDownload = new RequestVideoFileDownload(format)
                 .saveTo(outPutDir)
                 .renameTo(details.title())
                 .overwriteIfExists(true);
         Response<File> responseDownload = downloader.downloadVideoFile(requestVideoFileDownload);
         File data = responseDownload.data();
         System.out.println("Download Completed, Saved in: "+ data.getAbsolutePath());
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
