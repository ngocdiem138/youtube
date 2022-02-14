package com.youtube;

import com.youtube.daos.impls.VideoDAO;
import com.youtube.entities.Comment;
import com.youtube.entities.Video;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;


public class TestFunciton {

//    @Inject
//    IComInteractService comInteractService;

    public static void main(String[] args) throws IOException {

//        ComInteractService comInteractService = new ComInteractService();
//        CommentDAO commentDAO = new CommentDAO();
//        ComInteractDAO comInteractDAO = new ComInteractDAO();
//        ComInteract comInteractDB = comInteractDAO.findOne(Long.parseLong("15"), Long.parseLong("56"));
//        System.out.println(comInteractDB.getUserId());


//        VideoService videoService = new VideoService();
        VideoDAO videoDAO = new VideoDAO();

//        .stream().sorted(Comparator.comparing(Comment::getTime)).collect(Collectors.toList())
//        Collection<Comment> src = videoDAO.findOne(Long.parseLong("1")).getComments().stream().sorted(Comparator.comparing(Comment::getTime)).collect(Collectors.toList());
//        Collections.reverse(Arrays.asList(src.toArray()));
//        for(Comment comment : src) {
//            System.out.println(comment.getTime());
//        }

//        List<Comment> comments = new ArrayList<>(videoDAO.findOne(Long.parseLong("1")).getComments());
//        comments.sort(Comparator.comparing(Comment::getTime));
//        Collections.reverse(comments);
//        for (Comment comment : comments) {
//            System.out.println(comment.getTime());
//        }

//        StringBuilder keys = new StringBuilder("viet@gmail.com");
//
//        System.out.println(keys.replace(keys.indexOf("@"), keys.length(), ""));


//        String content = "noi di la di vay sao/nMac ke nươc mat roi";
//        String begin = "<p>";
//        String end = "</p>";
//        boolean isClose = false;
//        StringBuilder result = new StringBuilder();
//        result.append(begin);
//        for (int i = 0; i < content.length() - 2; i++) {
//            if (content.charAt(i) == '/' && content.charAt(i + 1) == 'n') {
//                result.append(end);
//                isClose = true;
//                if (!String.valueOf(content.charAt(i + 2)).isEmpty()) {
//                    result.append(begin);
//                    isClose = false;
//                }
//                i++;
//            } else {
//                result.append(content.charAt(i));
//            }
//        }
//        if (!isClose) {
//            result.append(end);
//        }
//        System.out.println(result.toString());

//        videoDAO.insert(new Video(
//                13,
//                "CÓ LẼ ANH CHƯA TỪNG - ONLY C ft. KARIK | OFFICIAL MUSIC VIDEO",
//                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/g_TGYUr0Lcs\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
//                11417041,
//                Timestamp.valueOf("2021-04-01 20:00:00.00"),
//                "#CoLeAnhChuaTung #OnlyC #Karik",
//                "CÓ LẼ ANH CHƯA TỪNG - ONLY C ft. KARIK |  OFFICIAL MUSIC VIDEO\n" +
//                        "\n" +
//                        "\uD83C\uDFB5 Nghe Audio tại:\n" +
//                        "\n" +
//                        "▶️ https://onlyc.streamlink.to/CoLeAnhCh...\n" +
//                        "\n" +
//                        "▶️ https://zingmp3.vn/bai-hat/Co-Le-Anh-...\n" +
//                        "\n" +
//                        "Music Director: OnlyC\n" +
//                        "Composer: OnlyC\n" +
//                        "Rap: Karik\n" +
//                        "Lyrics: Lou Hoàng - OnlyC\n" +
//                        "Music Producers: OnlyC – Justin TechN9\n" +
//                        "Mixing: Dương StillaD\n" +
//                        "Guitar: Danh Tú\n" +
//                        "Master: Dzũng Ezee\n" +
//                        "Recording: ZIKZAK\n" +
//                        "Studio: OnlyC Production\n" +
//                        "Project Director: Nguyễn Ngân Hà\n" +
//                        "Executive Producer: Nguyễn Mai\n" +
//                        "Starring: Kiều Minh Tuấn – Tú Hảo – bé Minh Anh\n" +
//                        "PR and Social Manager: Nhật Duy Lê\n" +
//                        "Artist Assistant: Ken DC\n" +
//                        "Stylist: Hoàng Ku \n" +
//                        "Stylist Assistant: My Trương – Duy Khánh – Gia Trân\n" +
//                        "Support: Remizio – The Tuxedo – Choice – The Country Boutiques – The Twenty Three – The Maven – Chaiko House – Dottie Premium – L’allee\n" +
//                        "Make up – Hair Artist : Mimi (Lâm Ngọc Minh) – Ngọc Lam -  Phan Uyển Khiết\n" +
//                        "Make up Assistant : Chu Hồng Mỹ Linh\n" +
//                        "Graphic Designer: Tuấn Maxx - Đinh Thiên Phú\n" +
//                        "Behind the scenes: Táo – Lê Văn Phương - Nicki\n" +
//                        "Photographer: Kiệt Võ - Táo\n" +
//                        "Photographic Assistant: Bá Kiệt\n" +
//                        "\n" +
//                        "Production house: 7Arts\n" +
//                        "Director: Phan Lên\n" +
//                        "Creative Director: William \n" +
//                        "Producer: Hiếu Nguyễn\n" +
//                        "Director of Photography: Trang Công Minh \n" +
//                        "Camera operator: Ngô Ngọc Thạch\n" +
//                        "Focus Puller: Nghiem Duy Hai\n" +
//                        "1st Ad: Phạm Nguyễn Bảo Hoàng\n" +
//                        "Assitant Producer: Kim Ngân Trương - Võ Hữu Phước \n" +
//                        "Art Director: Mee Hoàng\n" +
//                        "Props team: Vũ Trần\n" +
//                        "Camera: PS \n" +
//                        "Lighting: Cine Light\n" +
//                        "Catering: Huynh Nhuc Team\n" +
//                        "Editor: Lê Hồng Thuỷ\n" +
//                        "Colorist : Rei Arte \n" +
//                        "VFX : Human House\n" +
//                        "\n" +
//                        "•••More information about OnlyC: \n" +
//                        "Facebook: https://www.facebook.com/OnlyCproducer \n" +
//                        "Instagram: https://instagram.com/onlycproducer \n" +
//                        "••• More information about OnlyC Entertainment: \n" +
//                        "Facebook: https://m.facebook.com/OnlyC.Entertai... \n" +
//                        "Instagram: https://instagram.com/onlycent.official\n" +
//                        "\n" +
//                        "\n" +
//                        "#CoLeAnhChuaTung #OnlyC #Karik \n" +
//                        "► Subscribe để ủng hộ Only C nhé: https://goo.gl/5rtk22\n" +
//                        "► Facebook: https://www.facebook.com/onlyC.pro\n" +
//                        "\n" +
//                        "Lyric:\n" +
//                        "-----------------\n" +
//                        "© Bản quyền thuộc về OnlyC Production\n" +
//                        "© Copyright by OnlyC Production ☞ Do not Reup",
//                0,
//                0,
//                "https://i.ytimg.com/vi/d93HEYFWasQ/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAk6pBUGCANS9jgaberhkFfxWT7yg",
//                1,
//                1,
//                Timestamp.from(Instant.now()),
//                Long.valueOf("0"),
//                Timestamp.from(Instant.now()),
//                Long.valueOf("0")
//        ));
        System.out.println(videoDAO.findOne(13).getContent());
    }
}
