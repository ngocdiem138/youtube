package com.youtube;

import com.youtube.daos.IVideoDAO;
import com.youtube.daos.impls.VideoDAO;
import com.youtube.daos.utils.HibernateUtils;
import com.youtube.entities.Category;
import com.youtube.entities.Video;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class TestConnectDB {
    public static void main(String[] args) {

        try {
            IVideoDAO videoDAO = new VideoDAO();
            List<Video> videos = videoDAO.findAll();

            // Log data
            System.out.println(videos);

            System.out.println("Connected successfully");

        } catch (Exception e) {

            System.out.println("Connect unsuccessfully");
            e.printStackTrace();
        }
    }
}