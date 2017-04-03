package com.midigital.fujitsu.midigital.Parent;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.midigital.fujitsu.midigital.R;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static android.R.attr.id;
import static android.R.attr.progressBarStyle;

public class ShowSlideImage extends AppCompatActivity {

    ImageView mslideimage;

    Bitmap bitmap;
    String ImagePath;
    Uri URI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_slide_image);
        mslideimage = (ImageView) findViewById(R.id.slidefullimage);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("img", 0);
        mslideimage.setImageResource(intValue);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // show menu when menu button is pressed
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.image_download, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.download_img){                                         //getDrawable(intValue);

//            image_Url = String.valueOf(intValue);
//            Downloadimg downimg = new Downloadimg();
//            downimg.execute(image_Url);

            Intent mIntent = getIntent();
            int intValue = mIntent.getIntExtra("img", 0);

            Drawable drawable =  getResources().getDrawable(intValue,null);

            bitmap = ((BitmapDrawable)drawable).getBitmap();

            ImagePath = MediaStore.Images.Media.insertImage(
                    getContentResolver(),
                    bitmap,
                    "demo_image",
                    "demo_image"
            );

            URI = Uri.parse(ImagePath);

            Toast.makeText(ShowSlideImage.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();


            return true;
        }

        return super.onOptionsItemSelected(item);
    }


//    class Downloadimg extends AsyncTask<String,Integer,String>{
//        ProgressDialog progressdilg;
//
//        @Override
//        protected void onPreExecute() {
//            progressdilg = new ProgressDialog(ShowSlideImage.this);
//            progressdilg.setTitle("Download In Progress....");
//            progressdilg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//            progressdilg.setMax(100);
//            progressdilg.setProgress(0);
//            progressdilg.show();
//        }
//
//        @Override
//        protected String doInBackground(String... params) {
//
//            String path = params[0];
//            int file_length = 0;
//
//            try {
//
//                URL url = new URL(path);
//                URLConnection urlcncn = url.openConnection();
//                urlcncn.connect();
//                file_length = urlcncn.getContentLength();
//                File new_folder = new File("internal storage/Pictures");
//
//                if(!new_folder.exists())
//                {
//
//                    new_folder.mkdir();
//                }
//
//                File input_file = new File(new_folder,"downloaded_image.png");
//                InputStream  inputstream = new BufferedInputStream(url.openStream(),8192);
//                byte[] data = new byte[1024];
//                int total = 0;
//                int count = 0;
//                OutputStream outputstream = new FileOutputStream(input_file);
//
//                while ((count = inputstream.read(data))!=-1)
//                {
//
//                    total+=count;
//                    outputstream.write(data,0,count);
//                    int progress = (int) total*100/file_length;
//                    publishProgress(progress);
//                }
//
//                inputstream.close();
//                outputstream.close();
//
//            }
//            catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return "Download Complete....";
//        }
//
//        @Override
//        protected void onProgressUpdate(Integer... values) {
//            super.onProgressUpdate(values[0]);
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            progressdilg.hide();
//            Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
//        }
//    }


}
