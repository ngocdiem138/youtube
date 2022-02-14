package com.youtube.daos.utils;

import com.youtube.daos.ICategoryDAO;
import com.youtube.daos.IUserDAO;
import com.youtube.daos.IVideoDAO;
import com.youtube.daos.impls.CategoryDAO;
import com.youtube.daos.impls.UserDAO;
import com.youtube.daos.impls.VideoDAO;
import com.youtube.entities.Category;
import com.youtube.entities.User;
import com.youtube.entities.Video;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

public class InitData {

    private final IUserDAO userDAO;

    private final IVideoDAO videoDAO;

    private final ICategoryDAO categoryDAO;

    public InitData() {
        userDAO = new UserDAO();

        videoDAO = new VideoDAO();

        categoryDAO = new CategoryDAO();
    }

    public Collection<Category> initCategories() {
        Collection<Category> categories = new ArrayList<>();
        // 1
        categories.add(new Category(
                "music",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 2
        categories.add(new Category(
                "sport",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 3
        categories.add(new Category(
                "news",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 4
        categories.add(new Category(
                "review",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 5
        categories.add(new Category(
                "film",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 6
        categories.add(new Category(
                "education",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 7
        categories.add(new Category(
                "technology",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 8
        categories.add(new Category(
                "life",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 9
        categories.add(new Category(
                "game",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        // 10
        categories.add(new Category(
                "livestream",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        return categories;
    }

    public Collection<Video> initVideos() {
        Collection<Video> videos = new ArrayList<>();

        /* begin: music */
        videos.add(new Video(
                "CÓ LẼ ANH CHƯA TỪNG - ONLY C ft. KARIK | OFFICIAL MUSIC VIDEO",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/g_TGYUr0Lcs?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                11417041,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "#CoLeAnhChuaTung #OnlyC #Karik",
                "CÓ LẼ ANH CHƯA TỪNG - ONLY C ft. KARIK |  OFFICIAL MUSIC VIDEO\n" +
                        "<br/> \n" +
                        "\uD83C\uDFB5 Nghe Audio tại:\n" +
                        "<br/> \n" +
                        "▶️ https://onlyc.streamlink.to/CoLeAnhCh...\n" +
                        "<br/> \n" +
                        "▶️ https://zingmp3.vn/bai-hat/Co-Le-Anh-...\n" +
                        "<br/> \n" +
                        "Music Director: OnlyC\n" +
                        "Composer: OnlyC\n" +
                        "Rap: Karik\n" +
                        "Lyrics: Lou Hoàng - OnlyC\n" +
                        "Music Producers: OnlyC – Justin TechN9\n" +
                        "Mixing: Dương StillaD\n" +
                        "Guitar: Danh Tú\n" +
                        "Master: Dzũng Ezee\n" +
                        "Recording: ZIKZAK\n" +
                        "Studio: OnlyC Production\n" +
                        "Project Director: Nguyễn Ngân Hà\n" +
                        "Executive Producer: Nguyễn Mai\n" +
                        "Starring: Kiều Minh Tuấn – Tú Hảo – bé Minh Anh\n" +
                        "PR and Social Manager: Nhật Duy Lê\n" +
                        "Artist Assistant: Ken DC\n" +
                        "Stylist: Hoàng Ku \n" +
                        "Stylist Assistant: My Trương – Duy Khánh – Gia Trân\n" +
                        "Support: Remizio – The Tuxedo – Choice – The Country Boutiques – The Twenty Three – The Maven – Chaiko House – Dottie Premium – L’allee\n" +
                        "Make up – Hair Artist : Mimi (Lâm Ngọc Minh) – Ngọc Lam -  Phan Uyển Khiết\n" +
                        "Make up Assistant : Chu Hồng Mỹ Linh\n" +
                        "Graphic Designer: Tuấn Maxx - Đinh Thiên Phú\n" +
                        "Behind the scenes: Táo – Lê Văn Phương - Nicki\n" +
                        "Photographer: Kiệt Võ - Táo\n" +
                        "Photographic Assistant: Bá Kiệt\n" +
                        "<br/> \n" +
                        "Production house: 7Arts\n" +
                        "Director: Phan Lên\n" +
                        "Creative Director: William \n" +
                        "Producer: Hiếu Nguyễn\n" +
                        "Director of Photography: Trang Công Minh \n" +
                        "Camera operator: Ngô Ngọc Thạch\n" +
                        "Focus Puller: Nghiem Duy Hai\n" +
                        "1st Ad: Phạm Nguyễn Bảo Hoàng\n" +
                        "Assitant Producer: Kim Ngân Trương - Võ Hữu Phước \n" +
                        "Art Director: Mee Hoàng\n" +
                        "Props team: Vũ Trần\n" +
                        "Camera: PS \n" +
                        "Lighting: Cine Light\n" +
                        "Catering: Huynh Nhuc Team\n" +
                        "Editor: Lê Hồng Thuỷ\n" +
                        "Colorist : Rei Arte \n" +
                        "VFX : Human House\n" +
                        "<br/> \n" +
                        "•••More information about OnlyC: \n" +
                        "Facebook: https://www.facebook.com/OnlyCproducer \n" +
                        "Instagram: https://instagram.com/onlycproducer \n" +
                        "••• More information about OnlyC Entertainment: \n" +
                        "Facebook: https://m.facebook.com/OnlyC.Entertai... \n" +
                        "Instagram: https://instagram.com/onlycent.official\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "#CoLeAnhChuaTung #OnlyC #Karik \n" +
                        "► Subscribe để ủng hộ Only C nhé: https://goo.gl/5rtk22\n" +
                        "► Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "<br/> \n" +
                        "Lyric:\n" +
                        "-----------------\n" +
                        "© Bản quyền thuộc về OnlyC Production\n" +
                        "© Copyright by OnlyC Production ☞ Do not Reup",
                0,
                0,
                "https://i.ytimg.com/vi/g_TGYUr0Lcs/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB98aXrWMqqWDqQJjCfbESeiWFfWg",
                2,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "YÊU ĐƠN PHƯƠNG ( AUDIO REMASTERED ) | ONLYC x KARIK",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/d93HEYFWasQ?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                35140,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#onlyc #karik #yeudonphuong",
                "YÊU ĐƠN PHƯƠNG | ONLYC x KARIK | AUDIO REMASTERED\n" +
                        "<br/> \n" +
                        "#onlyc #karik #yeudonphuong\n" +
                        "<br/> \n" +
                        "*Lyric*\n" +
                        "Đã biết chắc sẽ như thế này\n" +
                        "Thức trắng suốt mấy đêm vì em\n" +
                        "1 lần nữa lại biết yêu...\n" +
                        "Sao không bên anh , sao lại như thế khi...\n" +
                        "Biết bao lâu đã vì em không quan tâm đến bất kỳ ai\n" +
                        "Trái tim này là thuộc về em có hay\n" +
                        "Sẽ không ai khiến anh lùi bước\n" +
                        "Chờ mong ai qua lối về , dù cho em...\n" +
                        "<br/> \n" +
                        "Dù cho đã biết , nếu đâm đầu yêu đơn phương sẽ không ai thấu mình đau\n" +
                        "đợi chờ 1 người như thói quen đã từ lâu\n" +
                        "Dù cho cố gắng đến mai sau cho dù cô dâu sánh đôi cũng bên ai\n" +
                        "Đành ngậm ngùi câu hát man mác yêu người đơn phương\n" +
                        "<br/> \n" +
                        "Kể từ ngày mình gặp hôm ấy , anh đã biết chắc có hôm nay\n" +
                        "1 ngày nỗi nhớ dâng đầy , xung quanh hình ảnh em bao vây \n" +
                        "Loay hoay mãi trong lòng 1 câu , “bây giờ phải làm sao đây ?” \n" +
                        "Khi tâm nói anh phải buông tay nhưng tim van nài anh đừng tháo chạy\n" +
                        "Anh...tự biết thân là kẻ đến sau\n" +
                        "Còn em như là con thuyền kể từ nay đã có bến đậu\n" +
                        "Nên chẳng mong , chẳng cầu , trời mang mình đến bên nhau\n" +
                        "Chỉ xin kỷ niệm ở lại , nỗi nhớ này đừng thêm sâu\n" +
                        "Vì yêu đơn phương là tự nguyện đau , là âm thầm nhớ\n" +
                        "Là chấp nhận cuối đầu trước duyên số , ngày đêm âm thầm chờ\n" +
                        "Xin cứ để nước mắt anh rơi cho trọn chân thành 1 người đứng sau\n" +
                        "Em không cần đáp trả tình cảm 1 gã si tình như là anh đâu\n" +
                        "(Hãy để nước mắt anh rơi cho trọn chân thành 1 người đến sau\n" +
                        "Dù đã biết có cố gắng mấy em mãi mãi chẳng thuộc về anh đâu)\n" +
                        "<br/> \n" +
                        "Em ơi cho tôi hay điều gì làm tan biến hết si mê\n" +
                        "Khi con tim đã khắc tên em bao ngày ,\n" +
                        "Ngay từ ấy đến mai sau này , luôn mãi như vậy\n" +
                        "Đành lòng vẫn yêu dù đơn phương\n" +
                        "<br/> \n" +
                        "Anh biết mình đã thật khờ dại khi luôn tận tâm với tình yêu này\n" +
                        "Trước hàng trăm lý do tổn thương bản thân nhưng chẳng thể nào buông tay\n" +
                        "Nhưng không sao , anh chấp nhận , có ra sao , vẫn chấp nhận\n" +
                        "Anh chấp nhận mãi đứng đây trông theo hạnh phúc em chọn lớn theo từng ngày\n" +
                        "Chấp nhận tình cảm mình lớn lên nhưng không bao giờ được gửi đến\n" +
                        "Chấp nhận mãi mãi bị lãng quên với ký ức chưa từng đặt tên \n" +
                        "Và anh chấp nhận tất cả dù sẽ chẳng còn được kề bên \n" +
                        "► Subscribe để ủng hộ Only C nhé: https://goo.gl/5rtk22\n" +
                        "► Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "© Bản quyền thuộc về OnlyC Production\n" +
                        "© Copyright by OnlyC Production ☞ Do not Reup",
                0,
                0,
                "https://i.ytimg.com/vi/d93HEYFWasQ/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAk6pBUGCANS9jgaberhkFfxWT7yg",
                2,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "ĐAU ĐỂ TRƯỞNG THÀNH | ONLYC | LIVE VERSION",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ReQqd2lNBjM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                119872,
                Timestamp.valueOf("2021-05-19 20:00:00.00"),
                "#daudetruongthanh #ddtt #onlyc",
                "ĐAU ĐỂ TRƯỞNG THÀNH | ONLYC | STAGE VERSION\n" +
                        "#daudetruongthanh #ddtt #onlyc\n" +
                        "Link Spotify : https://open.spotify.com/track/5iMdP8...\n" +
                        "Link MP3 : https://zingmp3.vn/bai-hat/Dau-De-Tru...\n" +
                        "-----------------\n" +
                        "ĐẠO DIỄN : PHƯỚC ĐẶNG\n" +
                        "MUSIC COMPOSER : ONLYC\n" +
                        "GUITAR : DANH TÚ\n" +
                        "KEYBOARD : JUSTIN TECHN9\n" +
                        "ELECTRIC GUITAR : KAN\n" +
                        "DRUM : TRẦN HẬU\n" +
                        "GUITAR BASS : HUYBOTHAI\n" +
                        "-----------------\n" +
                        "Lyric :\n" +
                        "Yêu, ai mà chẳng có lúc buồn\n" +
                        "Thương, ai rồi cũng đến lúc buông\n" +
                        "Ừ thì a phải đứng dậy thôi, nhật kí cất đi rồi\n" +
                        "Thôi nói ra làm gì lại càng thêm đau\n" +
                        "Nếu quay thời gian đến lúc đầu\n" +
                        "Để nói rằng: này chàng trai hãy nhớ cho\n" +
                        "Người con gái cô đơn lắm đấy, tại sao ko níu lấy?\n" +
                        "Để mất đi 1 người chỉ vì vô tâm\n" +
                        "<br/> \n" +
                        "Có những điều mà a muốn nói\n" +
                        "Không kịp đâu đã quá muộn rồi\n" +
                        "Có những điều mà a từng ngó lơ lại là ước mơ bao người\n" +
                        "Là tại anh, nỗi đau đi đến suốt đời\n" +
                        "Khi yêu chỉ cần như thế\n" +
                        "Chia tay có khi làm mình lớn lên\n" +
                        "Mỗi khi buồn thì em cứ khóc\n" +
                        "Khóc thật to mỗi a nghe thôi\n" +
                        "Mỗi khi đau niềm đau cũng xé đôi, vì a vẫn yêu e nhiều\n" +
                        "Dòng thời gian sẽ trôi để a thấy rằng\n" +
                        "Chia tay thì ta mới thấu mình đã sai từ đâu...\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "► Subscribe để ủng hộ Only C nhé: https://goo.gl/5rtk22\n" +
                        "► Fanpage: https://www.facebook.com/OnlyCproducer\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "© Bản quyền thuộc về OnlyC Production\n" +
                        "© Copyright by OnlyC Production ☞ Do not Reup",
                0,
                0,
                "https://i.ytimg.com/vi/ReQqd2lNBjM/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCcYQVzQYrcxHwM5yyVGCyrWQqnIQ",
                2,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "YÊU EM DẠI KHỜ | LOU HOÀNG | OFFICIAL MV",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/KyXKGurjX_4?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                48826681,
                Timestamp.valueOf("2018-12-21 20:00:00.00"),
                "",
                "YÊU EM DẠI KHỜ\n" +
                        "Produced by OnlyC\n" +
                        "-----------------  \n" +
                        "Arrangement : JustinTech9\n" +
                        "https://fb.me/justin.techn9\n" +
                        "Composed by Nguyen Jenda\n" +
                        "https://fb.me/cao.trungnguyen.948\n" +
                        "Guitar : Kan\n" +
                        "https://fb.me/KanThanTrong\n" +
                        "Mixing Master : Bo Tho Heo \n" +
                        " https://fb.me/botho.heo\n" +
                        "Excutive Producer Vinny Vu\n" +
                        "https://fb.me/vinnyvux\n" +
                        "Project Supervisor Nguyen Ngan Ha \n" +
                        "https://fb.me/ha.heo2\n" +
                        "Stylist : Thiên Thanh \n" +
                        "Make up : Mimi \n" +
                        "Assistant : Ken DC, Thai Duong ,Vu Map , Nhật Hòa, Thành Đạt \n" +
                        "Trang phục TRENDIANO - AEIE STUDIO\n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "*Lyrics by Lou Hoang \n" +
                        "<br/> \n" +
                        "Thức trắng đêm nay có lẽ do anh đang say \n" +
                        "Biết nói cho ai nghe đây bởi vì không còn được bên em mỗi ngày \n" +
                        "Mình từng hứa sẽ vượt qua \n" +
                        "Vậy mà kết thúc rời xa \n" +
                        "Cớ sao anh cứ mong chờ vì anh đã yêu dại khờ \n" +
                        "Từng cùng nhau đi qua giông bão nhưng ko còn thấy nhau khi mưa tan\n" +
                        "Tại vì sao tình yêu luôn khiến cho mình mãi tin vào một giấc mơ\n" +
                        "Ngày em quay lưng bước đi mưa rơi ướt nhòe lên trên khóe mi \n" +
                        "Vì khi yêu chẳng cần lý trí mặc kệ con tim làm điều vô lí. \n" +
                        "<br/> \n" +
                        "Đừng trao nhau ân ái nhạt màu đừng để trái tim cứ mãi u sầu \n" +
                        "Có đôi khi mệt quá và muốn rời xa \n" +
                        "Hãy nhớ lí do vì sao hai ta bắt đầu \n" +
                        "Lời chia tay không nói thành lời\n" +
                        "Và em cũng đau khi ta xa rời \n" +
                        "Phải ko người ơi, lệ rơi tim anh chơi vơi \n" +
                        "<br/> \n" +
                        "Vì a đã yêu e dại khờ ờ dù bơ vơ \n" +
                        "Tình yêu ấy mãi ko phai mờ a luôn tôn thờ ơ \n" +
                        "Chẳng thể xóa đi những vui cười ngày nào bên em \n" +
                        "Càng không muốn tương lai yêu người nao khác em \n" +
                        "Vì a đã yêu e dại khờ\n" +
                        "Thời gian qua nhiều phong ba làm cho ta tự gây ra điều buồn bã lại cãi vã rồi chia xa \n" +
                        "Pick up the phone vô tình giọng e vang lên \n" +
                        "Vậy nếu không nói gì thêm thôi từ nay nên quên tên \n" +
                        "Stop it thôi đừng nói nhiều thêm giờ quên được chưa \n" +
                        "Bây giờ đã quá trễ để có thể quay lại yêu lần nữa \n" +
                        "Tạm biệt tất cả những lời hứa dối trá \n" +
                        "Những gì đã trôi qua \n" +
                        "Tấm hình cũ đôi ta \n" +
                        "Xóa sạch hết phôi pha\n" +
                        "<br/> \n" +
                        "► Subscribe để ủng hộ Only C nhé: https://goo.gl/5rtk22\n" +
                        "► Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "© Bản quyền thuộc về OnlyC Production\n" +
                        "© Copyright by OnlyC Production ☞ Do not Reup",
                0,
                0,
                "https://i.ytimg.com/vi/KyXKGurjX_4/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCeUI48Y0NyPB-AkZcrpyHujq9fvg",
                2,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "QUAN TRỌNG LÀ THẦN THÁI | ONLYC ft KARIK | OFFICIAL VIDEO LYRIC",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/JqWuzvSMs08?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                50448415,
                Timestamp.valueOf("2018-03-15 20:00:00.00"),
                "",
                "Quan Trọng Là Thần Thái | OnlyC ft Karik | Official Video Lyric\n" +
                        "Compose : Only C, Karik\n" +
                        "Graphic Design : Bảo Bảo\n" +
                        "Video Editor : RIN\n" +
                        "<br/> \n" +
                        "*Lyric*\n" +
                        "Quan trọng phải là thần thái\n" +
                        "Quan trọng khi là con gái , \n" +
                        "Bao giờ yêu thì luôn đúng , chẳng bao giờ thấy sai\n" +
                        "Quan trọng vẫn là thần thái\n" +
                        "Khi mình yêu là con trai , \n" +
                        "Dẫu người ta gọi mình ái , cũng chẳng có gì để sai.\n" +
                        "<br/> \n" +
                        "Tốt hơn là mình thấy thần thái nằm đâu\n" +
                        "Tốt hơn là mình thấy thần thái đậm sâu\n" +
                        "Tốt hơn là mình thấy thần thái nằm đâu ,thấy thần thái nằm đâu ,thấy thần thái như nào\n" +
                        "<br/> \n" +
                        "Quan trọng ! vẫn là cái thần thái\n" +
                        "Quan trọng ! vẫn là cái thần thái\n" +
                        "Ai khen chê cứ mặc kệ , mình cứ ngầu có gì phải ngần ngại\n" +
                        "Vì mình đẹp chỗ nào tự mình biết , mình xấu chỗ nào cũng mình biết \n" +
                        "Cái gì của mình tự mình quyết để tâm làm gì mấy lời không cần thiết\n" +
                        "Bởi cơ bản xã hội vốn thị phi , bất kể là chuyện lớn hay là việc li ti\n" +
                        "Mình làm gì đi nữa thì họ vẫn dị nghị , thế nên kệ đi hơi đâu mà suy nghĩ\n" +
                        "Quan trọng nhất không phải vẻ bề ngoài\n" +
                        "Xấu , đẹp , chân ngắn hay chân dài\n" +
                        "Mình đang chơi hay là đứng gần ai\n" +
                        "Mà quan trọng là...\n" +
                        "<br/> \n" +
                        "Biển người biển khẩu lung tung , đúng hay sai miệng đời vẫn dậy sóng\n" +
                        "Tốt nhất bản thân cứ ung dung , để ra đường não bộ còn bay bổng\n" +
                        "Nếu cong không thẳng thì đã sao ?\n" +
                        "Lỡ thua không thắng thì đã sao ?\n" +
                        "Đen đúa không trắng thì đã sao ?\n" +
                        "Mình vẫn sống và đầu cứ ngẩng cao...\n" +
                        "Dù lên voi , hay xuống chó , nhà mình giàu hay không bằng chúng nó\n" +
                        "Bước ra đường , vẫn phải tỉnh , dù cho có bao nhiều thằng đứng ngó\n" +
                        "Vì quan trọng không phải vẻ bề ngoài\n" +
                        "Xấu , đẹp , chân ngắn hay chân dài\n" +
                        "Mình đang chơi hay là đứng gần ai\n" +
                        "Mà quan trọng là là là...\n" +
                        "<br/> \n" +
                        "Chơi lên chơi lên .... Ai ko chơi anh em tui chơi\n" +
                        "....\n" +
                        " Quan trọng phải là thần thái ,quan trọng phải là thần thái ,quan trọng vẫn là thần thái....\n" +
                        "<br/> \n" +
                        "► Subscribe để ủng hộ Only C nhé: https://goo.gl/5rtk22\n" +
                        "► Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "-----------------\n" +
                        "© Bản quyền thuộc về OnlyC Production\n" +
                        "© Copyright by OnlyC Production \n" +
                        "☞ Do not Reup",
                0,
                0,
                "https://i.ytimg.com/vi/JqWuzvSMs08/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAXzDvm92MnFXI5jn8yHO98sWgC4Q",
                2,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Ôm em lần cuối - Nit ft. Sing × 1 9 6 7 (\uD835\uDE68\uD835\uDE61\uD835\uDE64\uD835\uDE6C\uD835\uDE5A\uD835\uDE59 + \uD835\uDE67\uD835\uDE5A\uD835\uDE6B\uD835\uDE5A\uD835\uDE67\uD835\uDE57) /Toxic dope/",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/mi4_kT20JqY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                10651,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "#omemlancuoi #Nit #toxicdope",
                "Ôm em lần cuối - Nit ft. Sing × 1 9 6 7 (\uD835\uDE68\uD835\uDE61\uD835\uDE64\uD835\uDE6C\uD835\uDE5A\uD835\uDE59 + \uD835\uDE67\uD835\uDE5A\uD835\uDE6B\uD835\uDE5A\uD835\uDE67\uD835\uDE57) /Toxic dope/\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "©MV gốc:https://youtu.be/g337dA9zX3A\n" +
                        "©Lofi 1967:https://youtu.be/C9JfJZjzaFw\n" +
                        "<br/> \n" +
                        "——————————\n" +
                        "<br/> \n" +
                        "•Video này chỉ dùng để tận hưởng âm nhạc và giải trí, không mang mục đích thu lợi cá nhân.\n" +
                        "•Hình ảnh, âm thanh trong video đều ghi công cho nghệ sĩ/chủ sở hữu ban đầu.\n" +
                        "•Nếu có bất cứ thông tin quy phạm bản quyền thì mình sẽ xin phép gỡ bỏ ngay.\n" +
                        "<br/> \n" +
                        "•Chúc các bn có những giây phút thư giãn^^\n" +
                        "•Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "——————————\n" +
                        "<br/> \n" +
                        "•Lyrics:\n" +
                        "<br/> \n" +
                        "Chơ vơ cô đơn bảo ngày rồi đấy\n" +
                        "Sao anh chẳng thể quên đi được em …\n" +
                        "Anh ôm kí ức đôi ta đã từng có\n" +
                        "Lặng thầm mình anh cùng bao nỗi đau\n" +
                        "<br/> \n" +
                        "Chẳng nghĩ có lúc anh phải xa em thật rồi\n" +
                        "Bao đêm anh vẫn suy tư về em\n" +
                        "Dặn lòng mình phải quên em ,đừng bật khóc…\n" +
                        "Một lần này thôi mong em về đây\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Người nói sẽ yêu anh mãi đậm sâu\n" +
                        "Người nói sẽ bên anh mãi thật lâu\n" +
                        "Mà cớ vì sao em quay đầu , đi về nơi xa xôi quáaa\n" +
                        "<br/> \n" +
                        "Tình đã nhạt phai theo gió và mây\n" +
                        "Giờ chỉ còn bao nỗi nhớ ở đây\n" +
                        "Muốn ôm em thêm một lần cuối thôi….\n" +
                        "<br/> \n" +
                        "end..\n" +
                        "------------------------\n" +
                        "© Bản Quyền Thuộc Về 1 9 6 7 ⌦ Vui Lòng Không Reup Dưới Mọi Hình Thức!!!\n" +
                        "© Mọi thông tin bản quyền hay khiếu nại liên hệ: Contact@1967ent.com\n" +
                        "<br/> \n" +
                        "#omemlancuoi #Nit #toxicdope",
                0,
                0,
                "https://i.ytimg.com/vi/mi4_kT20JqY/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCukHxCkkjJs8vEH-c-Sx8LsF5ZMg",
                3,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "/Đi theo ánh nắng chiều tàn,phía cuối dòng người../Ánh chiều tàn - D Empty × Poll | slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/eZNO0RRwebA?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                181683,
                Timestamp.valueOf("2021-07-16 20:00:00.00"),
                "",
                "•Video này chỉ dùng để tận hưởng âm nhạc và giải trí, không mang mục đích thu lợi cá nhân.\n" +
                        "•Hình ảnh, âm thanh trong video đều ghi công cho nghệ sĩ/chủ sở hữu ban đầu.\n" +
                        "•Nếu có bất cứ thông tin quy phạm bản quyền thì mình sẽ xin phép gỡ bỏ ngay.\n" +
                        "<br/> \n" +
                        "•Chúc các bn có những giây phút thư giãn^^\n" +
                        "•Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "©MV gốc: https://youtu.be/AOYdD-3ole0\n" +
                        "©Mọi khiếu nại về bản quyền xin liên hệ: Toxicdope.911@gmail.com",
                0,
                0,
                "https://i.ytimg.com/vi/eZNO0RRwebA/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLByADGn9k66G8bPBCDtS3BeluBT9A",
                3,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "/Và nếu thời gian quay về đây,liệu trái tim kia../Trong trí nhớ của anh - Erik cover | slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/rjF850oB3cg?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1367871,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "•Video này chỉ dùng để tận hưởng âm nhạc và giải trí, không mang mục đích thu lợi cá nhân.\n" +
                        "•Hình ảnh, âm thanh trong video đều ghi công cho nghệ sĩ/chủ sở hữu ban đầu.\n" +
                        "•Nếu có bất cứ thông tin quy phạm bản quyền thì mình sẽ xin phép gỡ bỏ ngay.\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "•Chúc các bn có những giây phút thư giãn^^\n" +
                        "•Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "©MV gốc: https://youtu.be/0Jh2-uDQdoY \n" +
                        "©Mọi khiếu nại về bản quyền xin liên hệ: Toxicdope.911@gmail.com",
                0,
                0,
                "https://i.ytimg.com/vi/rjF850oB3cg/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAby3_YGcyLKnzp1kiKkXUAYxAubQ",
                3,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "/Và rồi anh cũng sẽ phải nhận ra,em đã đi xa từ hôm qua../ slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MAyItwTL3rg?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                104062,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "•Video này chỉ dùng để tận hưởng âm nhạc và giải trí, không mang mục đích thu lợi cá nhân.\n" +
                        "•Hình ảnh, âm thanh trong video đều ghi công cho nghệ sĩ/chủ sở hữu ban đầu.\n" +
                        "•Nếu có bất cứ thông tin quy phạm bản quyền thì mình sẽ xin phép gỡ bỏ ngay.\n" +
                        "<br/> \n" +
                        "•Chúc các bn có những giây phút thư giãn^^\n" +
                        "•Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "©MV gốc: https://youtu.be/FWYrRSWabIs\n" +
                        "©Mọi khiếu nại về bản quyền xin liên hệ: Toxicdope.911@gmail.com",
                0,
                0,
                "https://i.ytimg.com/vi/MAyItwTL3rg/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCqOSopXD0djezhzS6ONzvzVC19vA",
                3,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "/Gió ngân nga âu yếm bay phiêu bồng../Nắm đôi bàn tay - Kay Trần | slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/EYLKu9ICSIs?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                9567,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "•Video này chỉ dùng để tận hưởng âm nhạc và giải trí, không mang mục đích thu lợi cá nhân.\n" +
                        "•Hình ảnh, âm thanh trong video đều ghi công cho nghệ sĩ/chủ sở hữu ban đầu.\n" +
                        "•Nếu có bất cứ thông tin quy phạm bản quyền thì mình sẽ xin phép gỡ bỏ ngay.\n" +
                        "<br/> \n" +
                        "•Chúc các bn có những giây phút thư giãn^^\n" +
                        "•Page:https://www.facebook.com/toxicdope911\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "©MV gốc: https://youtu.be/7nB1q65RP8w\n" +
                        "©Mọi khiếu nại về bản quyền xin liên hệ: Toxicdope.911@gmail.com",
                0,
                0,
                "https://i.ytimg.com/vi/EYLKu9ICSIs/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAo8dEnX0mvNWLpcSowc6dICCM8fg",
                3,
                1,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: music */

        /* begin: sport */
        videos.add(new Video(
                "Trực tiếp | ĐT VIỆT NAM TẬP LUYỆN CHIỀU 3/11, CÔNG PHƯỢNG LẠI THAY ĐỔI KIỂU TÓC !",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/mRVBd5pOdxE?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                14343,
                Timestamp.valueOf("2021-11-03 20:00:00.00"),
                "#NextSports #DTVN #VongloaiWorldCup",
                "Trực tiếp | ĐT VIỆT NAM TẬP LUYỆN CHIỀU 3/11, CÔNG PHƯỢNG LẠI THAY ĐỔI KIỂU TÓC !\n" +
                        "<br/> \n" +
                        "Chiều 3/11, ĐT Việt Nam sẽ tiếp tục tập luyện để chuẩn bị cho 2 trận đấu diễn ra trong tháng 11 thuộc vòng loại thứ ba World Cup 2022. Mời quý vị và các bạn chú ý đón xem!\n" +
                        "<br/> \n" +
                        "#NextSports #DTVN #VongloaiWorldCup\n" +
                        "<br/> \n" +
                        "► Kênh Youtube chính thức, đăng ký ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - đồng hành cùng thể thao Việt Nam trên mọi chặng đường!",
                0,
                0,
                "https://i.ytimg.com/vi/mRVBd5pOdxE/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCo09h6fQFSePHLdnzZWL1rwmZL8w",
                4,
                2,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "HÀNH TRÌNH LỊCH SỬ U23 VIỆT NAM VCK U23 CHÂU Á I NHỮNG SIÊU PHẨM PHÚT CUỐI VÀ LOẠT PENALTY ĐỊNH MỆNH",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Z4K78CKKmxo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                6867,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "NEXT SPORTS | HÀNH TRÌNH LỊCH SỬ U23 VIỆT NAM VCK U23 CHÂU Á I NHỮNG SIÊU PHẨM PHÚT CUỐI VÀ LOẠT PENALTY ĐỊNH MỆNH\n" +
                        "<br/> \n" +
                        "► Kênh Youtube chính thức, đăng ký ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - đồng hành cùng thể thao Việt Nam trên mọi chặng đường!",
                0,
                0,
                "https://i.ytimg.com/vi/Z4K78CKKmxo/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDvo4UXEXjh-TX-a68U7RG-3uTHfQ",
                4,
                2,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "PARK HANG SEO - VỊ THUYỀN TRƯỞNG VĨ ĐẠI CỦA BĐVN, ĐỪNG VÌ VÀI TRẬN THUA MÀ ĐÃ VỘI QUAY LƯNG, CÚI ĐẦU",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/D3_U-iBiR28?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                3153,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "NEXT SPORTS | PARK HANG SEO - VỊ THUYỀN TRƯỞNG VĨ ĐẠI CỦA BĐVN, ĐỪNG VÌ VÀI TRẬN THUA MÀ ĐÃ VỘI QUAY LƯNG, CÚI ĐẦU\n" +
                        "<br/> \n" +
                        "► Kênh Youtube chính thức, đăng ký ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - đồng hành cùng thể thao Việt Nam trên mọi chặng đường!",
                0,
                0,
                "https://i.ytimg.com/vi/D3_U-iBiR28/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC7R3cYoXoQ5doPV-fWXXmjOp9u3w",
                4,
                2,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "CẬN CẢNH BUỔI TẬP CHIỀU 29/10 ĐT VIỆT NAM I MINH VƯƠNG TẬP RIÊNG, CÔNG PHƯỢNG TẮM MƯA SẮP CÓ TÓC MỚI",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/4mMVpgMgMF8?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                7351,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "NEXT SPORTS | CẬN CẢNH BUỔI TẬP NGÀY 29/10 CỦA ĐT VIỆT NAM | \n" +
                        "CẬN CẢNH BUỔI TẬP CHIỀU 29/10 ĐTVN I MINH VƯƠNG TẬP RIÊNG, CÔNG PHƯỢNG TẮM MƯA SẮP CÓ TÓC MỚI\n" +
                        "► Kênh Youtube chính thức, đăng ký ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - đồng hành cùng thể thao Việt Nam trên mọi chặng đường!",
                0,
                0,
                "https://i.ytimg.com/vi/4mMVpgMgMF8/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA346WfvKWEoT6rspnF_FxjqslcaA",
                4,
                2,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "HÀNH TRÌNH LỊCH SỬ U23 VIỆT NAM VCK U23 CHÂU Á I NHỮNG SIÊU PHẨM PHÚT CUỐI VÀ LOẠT PENALTY ĐỊNH MỆNH",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Z4K78CKKmxo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                6868,
                Timestamp.valueOf("2021-04-22 20:00:00.00"),
                "",
                "NEXT SPORTS | HÀNH TRÌNH LỊCH SỬ U23 VIỆT NAM VCK U23 CHÂU Á I NHỮNG SIÊU PHẨM PHÚT CUỐI VÀ LOẠT PENALTY ĐỊNH MỆNH\n" +
                        "<br/> \n" +
                        "► Kênh Youtube chính thức, đăng ký ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - đồng hành cùng thể thao Việt Nam trên mọi chặng đường!",
                0,
                0,
                "https://i.ytimg.com/vi/7aQhYNsReQM/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA_AruH1DWj1E9BmmCK-ky8VjtFeg",
                4,
                2,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Fight Week: UFC 268 Preview Show with Michael Bisping | Usman v Covington 2, Namajunas v Zhang",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/20fBE1SM8Qs?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                88779,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "#UFC268",
                "Michael Bisping, Adam Catterall and Nick Peet break down the second massive UFC card in the same number of weeks. They look ahead to UFC 268 and the rematch between Kamaru Usman and Colby Covington, and Rose Namajunas and Zhang Weili as well as the exciting fight with Justin Gaethje and Michael Chandler.\n" +
                        "<br/> \n" +
                        "Watch #UFC268 on Saturday from midnight on BT Sport 1 HD\n" +
                        "<br/> \n" +
                        "Hit 'Subscribe' above to ensure you never miss a video from the BT Sport YouTube channel.\n" +
                        "<br/> \n" +
                        "Get a BT Sport Monthly Pass now! - https://bit.ly/BTSportMonthlyPass \n" +
                        "<br/> \n" +
                        "Visit and subscribe to our 'BT Sport Boxing' YouTube channel ➡️ https://www.youtube.com/c/btsportboxing\n" +
                        "<br/> \n" +
                        "Twitter: https://twitter.com/btsport\n" +
                        "Facebook: https://www.facebook.com/btsport\n" +
                        "Instagram:https://instagram.com/btsport\n" +
                        "Website: https://sport.bt.com\n",
                0,
                0,
                "https://i.ytimg.com/vi/20fBE1SM8Qs/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBL580qwxEVOcClHEhA68TxI1AcLw",
                5,
                2,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: sport */

        /* begin: news */
        videos.add(new Video(
                "Dự báo thời tiết hôm nay mới nhất ngày 13/11/2021 | Dự báo thời tiết 3 ngày tới",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/e3uTbGN4-MM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                2796,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "#thoitiet #tintuc",
                "Dự báo thời tiết hôm nay mới nhất ngày 13/11/2021 | Dự báo thời tiết 3 ngày tới | Truyền Hình Nhân Dân\n" +
                        "Website: https://nhandantv.vn\n" +
                        "Xem Tin Tức hấp dẫn, Tổng Hợp Video Mới nhất về #thoitiet - Tin Thế Giới mới nhất đang diễn ra trong thời gian qua trên kênh truyền hình nhân dân - Kênh Tin Báo Nhân Dân sẽ cập nhật đến các bạn các thông tin đầy đủ nhất tại đây. Mời bạn đón xem nhé !\n" +
                        "Đăng Ký Xem Video #tintuc Miễn Phí: http://goo.gl/dVkSzA\n" +
                        "1. Dự Báo Thời Tiết Hôm Nay : https://bit.ly/2sNoeGo\n" +
                        "2. Bản Tin Sáng : https://bit.ly/2tAM882\n" +
                        "3. Bản Tin Trưa : https://bit.ly/2N2HHJJ\n" +
                        "4. Bản Tin Tối : https://bit.ly/35yEjwX",
                0,
                0,
                "https://i.ytimg.com/vi/dzhtPmsHIQs/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCpZUmtIgTJbKLN_Qe-f4LCnVtlMw",
                16,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Ukraine đưa 8.500 lính và cảnh sát đến biên giới với Belarus để ngăn người di cư vượt biên | VTC Now",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/B51QtrdnwMI\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                80956,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#vtcnow",
                "VTC Now | Ngày 11/11, Bộ trưởng Nội vụ Ukraine Denys Monastyrskiy cho biết quốc gia của ông sẽ triển khai thêm 8.500 binh sĩ và sĩ quan cảnh sát, cùng 15 máy bay trực thăng để bảo vệ biên giới với Belarus, ngăn chặn nguy cơ người di cư muốn vượt biên.\n" +
                        "<br/> \n" +
                        "(*) Tải ứng dụng trên App Store: https://apple.co/3CcvARH\n" +
                        "<br/> \n" +
                        "(*) Tải ứng dụng trên CH Play: https://bit.ly/3tFibhQ\n" +
                        "<br/> \n" +
                        "(*) Theo dõi thêm tại www.vtc.gov.vn",
                0,
                0,
                "https://i.ytimg.com/vi/B51QtrdnwMI/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDyyZq1ONFgMUzxAnV-_w5l8B36AQ",
                17,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Toàn cảnh ĐT Việt Nam vs ĐT Nhật Bản sau trận đấu:Mặc dù thua vẫn được thưởng lên tới 500 triệu đồng",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/HUdmaSTPED4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                36367,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#tintuc24hol #tintuc",
                "#tintuc24hol #tintuc  \n" +
                        "Dù chơi đầy nỗ lực, tạo ra một thế trận khá ấn tượng, ĐT Việt Nam vẫn không thể tránh khỏi thất bại với tỷ số 0-1 trước đội bóng hàng đầu châu Á – Nhật Bản tối ngày 11/11 tại Mỹ Đình. Đây cũng là thất bại thứ 5 liên tiếp của ĐT Việt Nam tại vòng loại thứ 3 World Cup 2022. Nhưng sau những gì đã thể hiện trong suốt 90 phút trận đấu, các học trò HLV Park Hang Seo vẫn xứng đáng được dành những lời ngợi khen.\n" +
                        "Thường trực Ban chấp hành Liên đoàn Bóng đá Việt Nam (VFF) đánh giá Quang Hải và đồng đội đã có trận đấu nỗ lực vượt bậc và khen ngợi tinh thần của đội bóng áo đỏ. Lãnh đạo VFF quyết định thưởng động viên cho toàn đội 500 triệu đồng và nhắc nhở các cầu thủ tiếp tục tập trung, chuẩn bị tốt nhất cho trận tiếp Saudi Arabia vào tối 16/11.\n" +
                        "Phát biểu sau trận đấu, HLV Park Hang Seo chia sẻ: ““Năng lực cá nhân giữa Nhật Bản và Việt Nam có khoảng cách. Các cầu thủ Việt Nam cũng đã nỗ lực hết sức rồi. Có một vấn đề thế này, Việt Nam đã thua 5 trận ở vòng loại thứ 3 World Cup 2022. Việc các cầu thủ cũng như Ban huấn luyện bị stress vì kết quả không tốt là sự thật. Suốt cuộc đời làm bóng đá, tôi mới hiểu kiếm 1 điểm lại khó đến thế nào. Việc Việt Nam vào vòng loại thứ 3 cũng cho thấy rằng nhiều đội tuyển mạnh hơn Việt Nam thật”.\n" +
                        "Sau trận đấu với Nhật Bản, ĐT Việt Nam sẽ có 4 ngày để chuẩn bị cho cuộc tiếp đón Saudi Arabia, đội bóng đang bất bại và hiện đứng đầu bảng B sau 5 lượt trận. Trận đấu sẽ diễn ra vào 19h00 ngày 16/11 tại sân Mỹ Đình. \n" +
                        "▶ TIN TỨC 24H ONLINE là kênh Youtube chia sẻ các nội dung tin tức, bản tin cập nhật 24h online, những nội dung giải trí hấp dẫn được phát sóng trên các kênh chương trình đài truyền hình, các tin tức cập nhật, chương trình truyền hình trực tiếp, chương trình thể thao, bóng đá, giải trí, game show, showbiz… Với mong muốn cập nhật những thông tin chính xác và nhanh nhất trên nền tảng số cho quý vị và các bạn.\n" +
                        " \n" +
                        "❤️❤️❤️ Cảm ơn các bạn đã xem video! Các bạn đừng quên nhấn vào ► Đăng Ký Kênh và biểu tượng \uD83D\uDD14 phía dưới góc phải của video để không bỏ lỡ những video mới nhất nhé ❤️❤️❤️\n" +
                        "<br/> \n" +
                        "▶ ĐĂNG KÝ KÊNH (miễn phí) TẠI ĐÂY: http://bit.ly/2n4bWWO\n" +
                        "<br/> \n" +
                        "▶ Xem những Clip mới và hấp dẫn nhất: \n" +
                        "- Thể thao: http://bit.ly/2n3dyQt \n" +
                        "- An ninh ngày mới hôm nay: http://bit.ly/2n6yKoT \n" +
                        "- Tin tức mới nhất 24h hôm nay: http://bit.ly/2n197pi \n" +
                        "- Tin tức Công nghệ tổng hợp: http://bit.ly/2l24YAY \n" +
                        "- Bản tin thời sự Tổng hợp hàng ngày: http://bit.ly/2l3JRyg \n" +
                        "- Vòng loại World Cup 2020 đội tuyển Việt Nam tổng hợp: http://bit.ly/2n1ddOc \n" +
                        "<br/> \n" +
                        "▶ Theo dõi Kênh TIN TỨC 24H ONLINE  trên: \n" +
                        "- Facebook : https://www.facebook.com/tt24hol/ \n" +
                        "- Twitter: https://twitter.com/tt24hol \n" +
                        "<br/> \n" +
                        "▶ Fair use for news reporting (https://www.youtube.com/yt/copyright/...) and (https://en.wikipedia.org/wiki/Fair_use) \n" +
                        "<br/> \n" +
                        "▶ Mọi vấn đề về video vi phạm Bản quyền (https://www.youtube.com/yt/copyright/), Chính sách (https://www.youtube.com/t/terms), \n" +
                        "- Nguyên tắc cộng đồng (http://www.youtube.com/yt/policyandsa...) chúng tôi sẽ xóa chúng, xin liên hệ trực tiếp qua email: now.tintuc@gmail.com . If there are any copyright issues with any videos posted here We will remove them, please contact our email: now.tintuc@gmail.com",
                0,
                0,
                "https://i.ytimg.com/vi/HUdmaSTPED4/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAHvfBVx3mw6OYA0qOCZ2jxEPve3g",
                17,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Chủ Tịch H. Cô Tô Bị Tố Dắt Cán Bộ Văn Hóa Vào Khách Sạn, Công An Lập Tức Trích Xuất Camera? | SKĐS",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Ml9UaQFXpqE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                3535,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#Share #quangninh #dinhchibithucoto",
                "SKĐS | Liên quan đến vụ việc Bí Thư - Chủ tịch Huyện Cô Tô, Quảng Ninh bị đình chỉ công tác. Mới đây, cơ quan cảnh sát điều tra đã vào cuộc xác minh và lập tức trích xuất Camera khách sạn - nơi xảy ra vụ việc. Vậy cụ thể hành vi đó như thế nào? Trích xuất camera có gì trong đó? Mời quý vị và các bạn cùng theo dõi ngay sau đây.\n" +
                        "<br/> \n" +
                        "Mời quý vị và các bạn xem thêm: Hoàn Nguyên - Tịnh Thất Bồng Lai: 'Chưa Từng Kêu Gọi Từ Thiện, Ai Thương Thì Người Ta Cho' https://youtu.be/yvzfUrtVA20?t=53\n" +
                        "<br/> \n" +
                        "\uD83D\uDD06Nút #Share của bạn giờ đây rất hữu ích \n" +
                        "--------------------\n" +
                        "\uD83D\uDC4DBáo Sức khỏe và Đời sống – Cơ quan ngôn luận của Bộ Y tế\n" +
                        "\uD83D\uDDA5Website: http://suckhoedoisong.vn/\n" +
                        "\uD83D\uDCBB FanPage: https://www.facebook.com/baosuckhoeva...\n" +
                        "\uD83D\uDCBBYoutube: https://bit.ly/Baosuckhoevadoisong\n" +
                        "\uD83D\uDCBBTiktok: https://bit.ly/3hOWND9\n" +
                        "<br/> \n" +
                        "#quangninh #dinhchibithucoto #lehungson #bithulehungson #skds #suckhoedoisong #baosuckhoedoisong",
                0,
                0,
                "https://i.ytimg.com/vi/Ml9UaQFXpqE/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC067IBZ6pMfeMbFDkzuPwJ_zmA2A",
                16,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Tối 12-11: Cả nước ghi nhận 8.976 ca mới, TP.HCM tăng 203 ca",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/pULS-_wFTbo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                83016,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#TinNong #Tin_Nóng #COVID19",
                "Tính từ 16h ngày 11/11 đến 16h ngày 12/11, trên Hệ thống Quốc gia quản lý ca bệnh COVID-19 ghi nhận 8.982 ca nhiễm mới, trong đó 6 ca nhập cảnh và 8.976 ca ghi nhận trong nước (tăng 831 ca so với hôm qua)\n" +
                        "<br/> \n" +
                        "#TinNong #Tin_Nóng #COVID19\n" +
                        "<br/> \n" +
                        "Kênh thông tin chính thức và duy nhất của #Báo_Tuổi_Trẻ trên YouTube.\n" +
                        " \n" +
                        "Tin tức nhanh nhất, mới nhất, nóng nhất đang diễn ra ở Việt Nam và thế giới về: thời sự, kinh tế, chính trị, xã hội, giáo dục, thể thao, văn hóa, giải trí, công nghệ, nhịp sống số, pháp luật, du lịch...\n" +
                        "<br/> \n" +
                        "#TuoiTre #BaoTuoiTre #TinNong #Thời_Sự #ThoiSu #Tuổi_Trẻ \n" +
                        "<br/> \n" +
                        "-----------\n" +
                        "Đăng ký kênh xem thêm nhiều chuyên mục hấp dẫn khác:\n" +
                        "https://bit.ly/3k1RCAR\n" +
                        "<br/> \n" +
                        "Website:\n" +
                        "- https://tuoitre.vn\n" +
                        "- https://tv.tuoitre.vn\n" +
                        "<br/> \n" +
                        "Facebook: \n" +
                        "- https://facebook.com/baotuoitre\n" +
                        "- https://facebook.com/Truyenhinh.BaoTu...\n" +
                        "<br/> \n" +
                        "Bản quyền nội dung thuộc về báo Tuổi Trẻ.\n" +
                        "--------------------\n" +
                        "TÒA SOẠN BÁO TUỔI TRẺ\n" +
                        "- Địa chỉ: Số 60A, Hoàng Văn Thụ, Phường.9, Quận Phú Nhuận, Thành phố Hồ Chí Minh, Việt Nam\n" +
                        "- Điện thoại: (84.8) 3.997.3838\n" +
                        "- Website: http://tuoitre.vn\n" +
                        "- Email: tto@tuoitre.com.vn\n" +
                        "- Đường dây nóng: 0918.033.133 - (84.8) 39.971.010",
                0,
                0,
                "https://i.ytimg.com/vi/pULS-_wFTbo/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLACdKvvlXbMgbhLjy5QN5h-5-EeAw",
                16,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Hiện trường vụ sạt lở 7 căn nhà ở đầu đường Khe Sanh, TP Đà Lạt",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/tNu-JnVQoHk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                11601,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#TinNong #Tin_Nóng #Sạt_Lở",
                "Chiều 12-11, một vụ sạt lở xảy ra ở đầu đường Khe Sanh, thuộc phường 10, TP Đà Lạt, tỉnh Lâm Đồng - làm ảnh hưởng đến 7 căn nhà, trong đó có 1 căn bị trôi hoàn toàn xuống phía bên dưới.\n" +
                        "<br/> \n" +
                        "#TinNong #Tin_Nóng #Sạt_Lở\n" +
                        "<br/> \n" +
                        "Kênh thông tin chính thức và duy nhất của #Báo_Tuổi_Trẻ trên YouTube.\n" +
                        " \n" +
                        "Tin tức nhanh nhất, mới nhất, nóng nhất đang diễn ra ở Việt Nam và thế giới về: thời sự, kinh tế, chính trị, xã hội, giáo dục, thể thao, văn hóa, giải trí, công nghệ, nhịp sống số, pháp luật, du lịch...\n" +
                        "<br/> \n" +
                        "#TuoiTre #BaoTuoiTre #TinNong #Thời_Sự #ThoiSu #Tuổi_Trẻ ",
                0,
                0,

                "https://i.ytimg.com/vi/tNu-JnVQoHk/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA-wfDoDho0yoDS8DMV96UNmd-eGQ",
                17,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Thủ tướng Phạm Minh Chính: Phân bố vaccine vẫn chưa công bằng lắm",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/N-3_5XC860A\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                82490,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#vtcnow",
                "VTC Now | Sáng 12/11, trả lời chất vấn về vấn đề đảm bảo sự công bằng, quyền được tiêm 2 mũi vaccine cho mọi địa phương trên cả nước, Thủ tướng pHạm Minh Chính cho biế, thời gian qua phân bố vaccine vẫn chưa công bằng do phải tập trung cho các địa phương có dịch. \n" +
                        "<br/> \n" +
                        "(*) Tải ứng dụng trên App Store: https://apple.co/3CcvARH\n" +
                        "<br/> \n" +
                        "(*) Tải ứng dụng trên CH Play: https://bit.ly/3tFibhQ\n" +
                        "<br/> \n" +
                        "(*) Theo dõi thêm tại www.vtc.gov.vn",
                0,
                0,
                "https://i.ytimg.com/vi/N-3_5XC860A/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAN5vGIWKZRCP53gPaJhUzzLGKypw",
                16,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Tin Biển Đông mới nhất 6/11. Anh tuyên bố sốc nếu máy bay của Trung Quốc xuất kích trên Biển Đông",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/oJKTOBb37zE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                236600,
                Timestamp.valueOf("2021-11-6 20:00:00.00"),
                "#tintuc24hol #tintuc",
                "Thưa quý vị và các bạn, mặc dù không có quyền lợi trực tiếp ở Biển Đông nhưng Anh nhiều lần tuyên bố không chấp nhận bất kỳ quốc gia nào trên thế giới ngang tàng bất chấp luật biển. Mới đây nhất, Anh đã theo dõi các tàu ngầm của Trung Quốc từ tàu sân bay và sẵn sàng đánh chặn các máy bay phản lực của Bắc Kinh ở Biển Đông nếu có chỉ đạo.\n" +
                        "<br/> \n" +
                        "▶ TIN TỨC 24H ONLINE là kênh Youtube chia sẻ các nội dung tin tức, bản tin cập nhật 24h online, những nội dung giải trí hấp dẫn được phát sóng trên các kênh chương trình đài truyền hình, các tin tức cập nhật, chương trình truyền hình trực tiếp, chương trình thể thao, bóng đá, giải trí, game show, showbiz… Với mong muốn cập nhật những thông tin chính xác và nhanh nhất trên nền tảng số cho quý vị và các bạn.\n" +
                        " \n" +
                        "❤️❤️❤️ Cảm ơn các bạn đã xem video! Các bạn đừng quên nhấn vào ► Đăng Ký Kênh và biểu tượng \uD83D\uDD14 phía dưới góc phải của video để không bỏ lỡ những video mới nhất nhé ❤️❤️❤️\n" +
                        "<br/> \n" +
                        "▶ ĐĂNG KÝ KÊNH (miễn phí) TẠI ĐÂY: http://bit.ly/2n4bWWO\n" +
                        "<br/> \n" +
                        "▶ Xem những Clip mới và hấp dẫn nhất: \n" +
                        "- Thể thao: http://bit.ly/2n3dyQt \n" +
                        "- An ninh ngày mới hôm nay: http://bit.ly/2n6yKoT \n" +
                        "- Tin tức mới nhất 24h hôm nay: http://bit.ly/2n197pi \n" +
                        "- Tin tức Công nghệ tổng hợp: http://bit.ly/2l24YAY \n" +
                        "- Bản tin thời sự Tổng hợp hàng ngày: http://bit.ly/2l3JRyg \n" +
                        "- Vòng loại World Cup 2020 đội tuyển Việt Nam tổng hợp: http://bit.ly/2n1ddOc \n" +
                        "<br/> \n" +
                        "▶ Theo dõi Kênh TIN TỨC 24H ONLINE  trên: \n" +
                        "- Facebook : https://www.facebook.com/tt24hol/ \n" +
                        "- Twitter: https://twitter.com/tt24hol \n" +
                        "<br/> \n" +
                        "▶ Fair use for news reporting (https://www.youtube.com/yt/copyright/...) and (https://en.wikipedia.org/wiki/Fair_use) \n" +
                        "<br/> \n" +
                        "▶ Mọi vấn đề về video vi phạm Bản quyền (https://www.youtube.com/yt/copyright/), Chính sách (https://www.youtube.com/t/terms), \n" +
                        "- Nguyên tắc cộng đồng (http://www.youtube.com/yt/policyandsa...) chúng tôi sẽ xóa chúng, xin liên hệ trực tiếp qua email: now.tintuc@gmail.com . If there are any copyright issues with any videos posted here We will remove them, please contact our email: now.tintuc@gmail.com",
                0,
                0,
                "https://i.ytimg.com/vi/oJKTOBb37zE/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA6I8As7gYurGUeDIJAF6UePNmsQg",
                17,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Nhà Tiên Tri Nostradamus Và Những Tiên Đoán Về Thảm Kịch Sắp Xảy Ra Vào Tháng 11/2021 | TGN",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/U4slniRnuN8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1260901,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#thếgiớinghiêng #tgn #nhàtiêntriNostradamus",
                "THẾ GIỚI NGHIÊNG | Mới đây, sau những gì Virus corona chủng mới có nguồn gốc từ Vũ Hán, Trung Quốc gây ra, người ta lại đặt ra câu hỏi về những tiên tri của Nostradamus cảnh báo từ 500 năm trước. Liệu có phải dịch bệnh do virus corona gây ra hiện nay đã được nhà tiên tri thiên tài Nostradamus tiên tri trước đó, thảm kịch nào sắp xảy ra vào tháng 11/2021, ngay sau đây hãy cùng Thế Giới Nghiêng giải mã.\n" +
                        "<br/> \n" +
                        "Mời quý vị và các bạn xem thêm:  Thực Hư Vắc –Xin Trung Quốc Và Chất Lượng Ngừa Covid-19 Toàn Cầu?: https://youtu.be/Y6_upDu13DI\n" +
                        "✮✮✮ XEM THÊM ✮✮✮\n" +
                        "★ TIN THẾ GIỚI MỚI NHẤT: https://bit.ly/TINTHEGIOIMOINHAT\n" +
                        "★ Dịch Covid-19 tại Ấn Độ: https://bit.ly/DichCovidAnDo \n" +
                        "★ Tin Tức Biển Đông Mới Nhất: https://bit.ly/TinTucBienDongMoiNhat \n" +
                        "★ Hành trình phá án mới nhất: https://bit.ly/HanhTrinhPhaAnHayNhat\n" +
                        "<br/> \n" +
                        "Kênh Thế Giới Nghiêng - TGN là kênh tổng hợp tin tức, thời sự Việt Nam và thế giới, cập nhật những tin tức và diễn biến mới nhất về tình hình quân sự, an ninh, chính trị, kinh tế và văn hóa quốc tế, đặc biệt là về tình hình Biển Đông, Mỹ - Trung Quốc, cùng các phân tích, bình luận của các chuyên gia, học giả trong nước và quốc tế. \n" +
                        "Cảm ơn các bạn đã xem video! Hãy đăng ký kênh để cập nhật thông tin mới hữu ích nhất!\n" +
                        "<br/> \n" +
                        "✮✮✮ ĐĂNG KÝ KÊNH ✮✮✮ \n" +
                        "★ Thế Giới Nghiêng: http://bit.ly/TheGioiNghiengSubscribe\n" +
                        "★ Tin Tức Việt Nam : http://bit.ly/TinTucVietNamSubscribe\n" +
                        "★ Kênh được vận hành bởi 5G Network \n" +
                        "★ Mọi vấn đề bản quyền xin liên hệ: copyright@5gmedia.vn",
                0,
                0,
                "https://i.ytimg.com/vi/U4slniRnuN8/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBPv_LbmURn5a3nrzwJpDV5aXthcA",
                16,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Tin thế giới mới nhất 28/10 | Mỹ - Trung khẩu chiến gay gắt về vấn đề Đài Loan | FBNC",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/12nHX2YKV2U\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                310395,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#tintucfbnc #tinthegioi #tinthegioimoinhat",
                "Tin thế giới mới nhất 28/10 | Mỹ - Trung khẩu chiến gay gắt về vấn đề Đài Loan\n" +
                        "TRUNG QUỐC- NGA VỪA RỜI ĐI, MỸ - NHẬT ĐÃ RẦM RỘ TẬP TRẬN CHUNG TRÊN BIỂN ĐÔNG\n" +
                        "ÁM CHỈ TRUNG QUỐC, NHẬT BẢN TUYÊN BỐ PHẢN ĐỐI MẠNH MẼ NHỮNG THÁCH THỨC TRẬT TỰ HÀNG HẢI \n" +
                        "TRUNG QUỐC TUYÊN BỐ SẼ CÙNG ASEAN NGHIÊN CỨU CÁC LĨNH VỰC MỚI CHO THỎA THUẬN THƯƠNG MẠI TỰ DO\n" +
                        "PHỚT LỜ CẢNH CÁO CỦA TRUNG QUỐC, PHÁI ĐOÀN NGHỊ VIỆN CHÂU ÂU VẪN SẼ ĐẾN THĂM ĐÀI LOAN \n" +
                        "TRUNG QUỐC KIÊN QUYẾT PHẢN ĐỐI SỰ ỦNG HỘ ĐÀI LOAN GIA NHẬP LHQ CỦA MỸ\n" +
                        "CẬN CẢNH “KHUNG XƯƠNG NGƯỜI SẮT” MỚI CỦA QUÂN ĐỘI ĐÀI LOAN \n" +
                        "TRUNG QUỐC: CÁC BÁC SỸ Ở TÂN CƯƠNG GỌI TIN ĐỒN TRIỆT SẢN PHỤ NỮ LÀ “HOÀN TOÀN VÔ CĂN CỨ”\n" +
                        "WTO ĐỒNG Ý ĐIỀU TRA MỨC THUẾ CỦA TRUNG QUỐC TRONG TRANH CHẤP RƯỢU VANG VỚI ÚC\n" +
                        "KẾ HOẠCH ĐÁNH THUẾ BDS CỦA TRUNG QUỐC SẼ BỊ TRÌ HOÃN VÌ CÓ THỂ “ĐỤNG” ĐẾN GIỚI CHÍNH TRỊ?\n" +
                        "NGA LÙNG SỤC CƯỚP BIỂN TRÊN TÀU HÀNG GAY CẤN NHƯ PHIM HÀNH ĐỘNG\n" +
                        "MỸ XEM XÉT ĐƯA ISRAEL, ROMANIA VÀ BULGARIA VÀO CHƯƠNG TRÌNH MIỄN THỊ THỰC\n" +
                        "NỮ HOÀNG ANH ELIZABETH II KHÔNG DỰ HỘI NGHỊ COP26\n" +
                        "QUÝ III/2021, LỢI NHUẬN CÔNG TY MẸ CỦA GOOGLE TĂNG VỌT\n" +
                        "ÔNG JACK MA ĐANG THĂM NHIỀU ĐỊA ĐIỂM Ở HÀ LAN\n" +
                        "TỔNG THỐNG MỸ ĐẾN VATICAN, HỘI ĐÀM VỚI GIÁO HOÀNG FRANCIS\n" +
                        "ĐẾM NGƯỢC 100 NGÀY, OLYMPIC BẮC KINH 2022 ĐỐI MẶT VỚI NGUY CƠ LỚN TỪ COVID-19\n" +
                        "CANADA RA MẮT ĐỒNG PHỤC OLYMPIC MÙA ĐÔNG BẮC KINH 2022\n" +
                        "CHÍNH THỨC: CÁC TAY VỢT CHƯA TIÊM PHÒNG COVID-19 VẪN ĐƯỢC THAM GIA GIẢI ÚC MỞ RỘNG 2022\n" +
                        "HÀNG NGÀN NGƯỜI NICARAGUA ĐẾN HONDURAS ĐỂ TIÊM CHỦNG\n" +
                        "PERU NỖ LỰC BẢO TỒN LẠC ĐÀ VICUNA\n" +
                        "NASA PHÁT HIỆN DẤU HIỆU VỀ HÀNH TINH ĐẦU TIÊN BÊN NGOÀI DẢI NGÂN HÀ\n" +
                        "--------------------\n" +
                        "FBNC (Financial Business News Channel) là kênh tin tức chuyên về kinh tế - Tài chính, bất động sản, chứng khoán - cổ phiếu, cập nhật giá vàng , tin thế giới, tin tức 24h,… Với mong muốn cập nhật những thông tin chính xác và nhanh nhất cho quý vị và các bạn.!\n" +
                        "- Đăng ký kênh để theo dõi tin tức mới nhất: http://popsww.com/FBNC\n" +
                        "- FBNC Giải Trí: https://www.youtube.com/channel/UCuaJ...\n" +
                        "Kênh truyền thông FBNC:\n" +
                        "- Fanpage: https://www.facebook.com/kinhtetaichi...\n" +
                        "- Group thảo luận, tin nóng: https://www.facebook.com/groups/11262...\n" +
                        "- Zalo: https://zalo.me/fbncvn\n" +
                        "- Website: http://fbncvietnam.com/\n" +
                        "- Email: contact@fbnc.vn",
                0,
                0,
                "https://i.ytimg.com/vi/iJkL88oQs0g/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDIsUanZ-FqtC62EHkhJOLfEwxOnw",
                17,
                3,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: news */

        /* begin: review */
        videos.add(new Video(
                "Lạc Vào Thế Giới Game \"Nhưng Có Nạp Lần Đầu\" \uD83D\uDE08\uD83E\uDD75 | Tập Làm Anime | Tóm Tắt Anime Hay",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/UqNw2CrRCPQ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                783102,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#anime",
                "Tóm Tắt Anime Hay :\n" +
                        "• Tên Anime : Infinite Dendrogam\n" +
                        "\uD83C\uDF38 Like videos và subscribes cho Tập Làm Anime nếu bạn thấy thích nhé.\n" +
                        "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n" +
                        "♫ Music in video :\n" +
                        "♡ Track:  NEFFEX - Till I Let Go [Copyright Free]\n" +
                        "♡ Music provided by NEFFEX\n" +
                        "♡ Watch: https://www.youtube.com/watch?v=8bblU...\n" +
                        "♫ Music in video : NEFFEX - Till I Let Go [Copyright Free]\n" +
                        "♡ Track:  NEFFEX - FOYF [Copyright Free]\n" +
                        "♡ Music provided by NEFFEX\n" +
                        "♡ Watch: https://www.youtube.com/watch?v=yTz_M...\n" +
                        "♫ Music in video : \n" +
                        "♡ Track: NEFFEX - SOMETHING YOU COULD NEVER OWN [Copyright Free]\n" +
                        "♡ Music provided by NEFFEX\n" +
                        "♡ Watch: https://www.youtube.com/watch?v=CO1QE...\n" +
                        "♫ Music in video : \n" +
                        "♡ Track: NEFFEX - INSPIRED [Copyright Free]\n" +
                        "♡ Music provided by NEFFEX\n" +
                        "♡ Watch: https://www.youtube.com/watch?v=cjny7...\n" +
                        "♫ Music in video :\n" +
                        "♡ Track:  NEFFEX - IT'S ONLY WORTH IT IF YOU WORK FOR IT [Copyright Free]\n" +
                        "♡ Music provided by NEFFEX\n" +
                        "♡ Watch: https://www.youtube.com/watch?v=QNZy8...\n" +
                        "♫ Music in video :\n" +
                        "♡ Track:  NEFFEX - A YEAR AGO [Copyright Free]\n" +
                        "♡ Music provided by NEFFEX\n" +
                        "♡ Watch: https://www.youtube.com/watch?v=9_va5...\n" +
                        "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n" +
                        "★ Từ khóa :\n" +
                        "⋆Review phim\n" +
                        "⋆Review hoạt hình\n" +
                        "⋆Main bá\n" +
                        "⋆Hành Động\n" +
                        "⋆Shounen\n" +
                        "⋆Siêu Nhiên \n" +
                        "⋆Đời Thường\n" +
                        "⋆Fantasy\n" +
                        "⋆Siêu Nhiên\n" +
                        "⋆Hài Hước \n" +
                        "⋆Phép Thuật \n" +
                        "⋆Harem\n" +
                        "⋆Học Đường\n" +
                        "⋆Viễn Tưởng\n" +
                        "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n" +
                        "✽ Mọi vấn đề về vi phạm chính sách , luật bản quyền hay nguyên tắc cộng đồng , xin hãy liên hệ tôi tại\n" +
                        "↪ Trantqkhai@gmail.com\n" +
                        "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n" +
                        "♦ All Music , Pictures, Videos and Sounds That Appear In This Video Are Owned By Their Respective Owners\n" +
                        "♦ Copyright Disclaimer, Under Section 107 of the Copyright Act 1976, allowance is made for 'fair use' for purposes such as criticism, comment, news reporting, teaching, scholarship, and research. Fair use is a use permitted by copyright statute that might otherwise be infringing. Non-profit, educational or personal use tips the balance in favor of fair use.\n" +
                        "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n" +
                        "♡ Cảm Ơn Các Bạn Đã Xem Video Của Mình ଘ(੭*ˊᵕˋ)੭* ੈ✩‧₊˚♡",
                0,
                0,
                "https://i.ytimg.com/vi/UqNw2CrRCPQ/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDJd2yXRnZ4NaWO1Lq10pmHE5fd-Q",
                18,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "[Review Phim] Viên Đá Bé Tẹo Khiến Hành Tinh Bay Màu Trong 1 Nốt Nhạc | Men In Black",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/g3i8LmsXMUU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                554785,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#reviewphim #netflix #meninblack #phimkinhdi #tomtatphim #phimhai #willsmith",
                "Tóm Tắt Phim Viễn Tưởng Siêu Hài Hước | Review Phim Đặc Vụ Áo Đen 4.\n" +
                        "<br/> \n" +
                        "Đặc Vụ Áo Đen Phần 4 (Men in Black 4) là một bộ phim hành động khoa học viễn tưởng theo truyện tranh 3D của Mỹ 2019 do F. Gary Gray đạo diễn và có sự tham gia dàn diễn viên không xuất hiện 3 phần trước: Chris Hemsworth, Tessa Thompson và Liam Neeson.\n" +
                        "Bấy lâu nay, Đặc vụ Áo Đen luôn là những người hùng thầm lặng “ngầu” nhất, bảo vệ Trái Đất khỏi những hiểm họa xấu xa ngoài hành tinh. Trong cuộc phiêu lưu mới này, họ phải đối mặt với mối đe dọa mang tính toàn cầu lớn nhất từ trước đến giờ: truy tìm điệp viên hai mang ẩn mình trong tổ chức Men In Black. ",
                0,
                0,
                "https://i.ytimg.com/vi/g3i8LmsXMUU/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAdDiajcp4As54DU_4Ey6myP1TiJQ",
                19,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Hậu Duệ Cuối Cùng Của Tộc Rồng Khổng Lồ | Review Phim | Tóm Tắt Phim\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/--H8KhqpzM0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1133305,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#reviewphim #phimreview #tomtatphim",
                "Hậu Duệ Cuối Cùng Của Tộc Rồng Khổng Lồ | Review Phim | Tóm Tắt Phim\n" +
                        "#reviewphim #phimreview #tomtatphim\n" +
                        "Đây là video tóm tắt nội dung phim",
                0,
                0,
                "https://i.ytimg.com/vi/6CizF2aPdio/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDR6iB0QcLHt3q_6uYomjeZRcA1Iw",
                20,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Cuộc Đối Đầu Với Đội Quân Côn Trùng Khổng Lồ | Review Phim | Tóm Tắt Phim\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/m0uGZtkaFvU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                251519,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#reviewphim #phimreview #tomtatphim",
                "Cuộc Đối Đầu Với Đội Quân Côn Trùng Khổng Lồ | Review Phim | Tóm Tắt Phim\n" +
                        "#reviewphim #phimreview #tomtatphim\n" +
                        "Đây là video tóm tắt nội dung phim",
                0,
                0,
                "https://i.ytimg.com/vi/xnIsP8F50n4/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCNVWyibTiftSA3adk3gqI3er7btg",
                20,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "[Review] TOP sản phẩm làm đẹp NỘI ĐỊA TRUNG SIÊU RẺ HOT VÔ ĐỐI trên SHOPEE CHỈ TỪ 1K!",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/92M7oMHuyds\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                632248,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#NoCopyright #CopyrightFree #1HMNCNoCopyrightMusic",
                "Review] TOP sản phẩm làm đẹp NỘI ĐỊA TRUNG SIÊU RẺ HOT VÔ ĐỐI trên SHOPEE CHỈ TỪ 1K!\n" +
                        "<br/> \n" +
                        "Link sản phẩm trong video\n" +
                        "<br/> \n" +
                        "1. Mặt nạ giấy dưỡng trắng da mụn cấp ẩm thải độc HA Images\n" +
                        "https://shp.ee/u5vtwj3\n" +
                        "2.  Mặt nạ dưỡng môi collagen nội địa trung biaqua,images giảm thâm môi làm mềm môi\n" +
                        "https://shp.ee/gxn6qc3\n" +
                        "3. Mặt Nạ Dưỡng Ẩm Dưỡng Trắng Da HA Maycreate Mask \n" +
                        "https://shp.ee/kpwjkx3\n" +
                        "4. Mặt nạ mắt Images 80g (60 cái)\n" +
                        "https://shp.ee/4gvspu3\n" +
                        "5. Bộ 60 Miếng Mặt Nạ Lanbena \n" +
                        "https://shp.ee/pqv3yt3\n" +
                        "6. Cọ Rửa Mặt GDTIMA Hình Bạch Tuộc Độc Đáo Chất Lượng Cao 20g\n" +
                        "https://shp.ee/j836wqj\n" +
                        "7. Bông Tẩy Trang Cotton Pads 3 Lớp Túi 222 Miếng\n" +
                        "https://shp.ee/8bj7x3j\n" +
                        "8. Bông tẩy trang Laneila \n" +
                        "https://shp.ee/ka459q3",
                0,
                0,
                "https://i.ytimg.com/vi/92M7oMHuyds/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLD44HQcN3cnouhyr5FkDx4_koYTaA",
                18,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "[Review] Kem chống nắng Hemia, Ủ nhả nắng Yến tươi Queen Perfect, Kem body | U là trời !!!\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/XZZ65Ny4XKo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                97299,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#HALINH #HEMIA #QUEENPERFECT",
                "[Review] Kem chống nắng Hemia, Ủ nhả nắng Yến tươi Queen Perfect, Kem body | U là trời!\n" +
                        "<br/> \n" +
                        "♥ Connect with me: \n" +
                        "►Youtube: https://bit.ly/2mzuNZY\n" +
                        "►Page: https://www.facebook.com/vohalinh.bee\n" +
                        "►Facebook : https://www.facebook.com/halinh.bee\n" +
                        "►Instagram: https://www.instagram.com/vth.linh\n" +
                        "►Email: vhlinh.1211@gmail.com\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "#HALINH #HEMIA #QUEENPERFECT\n",
                0,
                0,
                "https://i.ytimg.com/vi/XZZ65Ny4XKo/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLApkaFGoetAo2L4uoM-Xd9Yt4CJVA",
                19,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "10 smartphone DƯỚI 5 TRIỆU học online TỐT NHẤT 2021: Màn đẹp, pin trâu, loa tốt, bảo hành ĐẦY ĐỦ!\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Pu8M2sYa5jw\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                103114,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#Xiaomi #Realme #Vsmart",
                "10 smartphone DƯỚI 5 TRIỆU học online TỐT NHẤT 2021: Màn đẹp, pin trâu, loa tốt, bảo hành ĐẦY ĐỦ!\n" +
                        "Đặt trước iPhone 13 series tại Di Động Việt:\n" +
                        "\uD83D\uDD17 https://didongviet.vn/iphone-13\n" +
                        "Đặt hàng Samsung Galaxy Z Fold3 5G, Galaxy Z Flip3 5G tại:\n" +
                        "\uD83D\uDD17 https://didongviet.vn/galaxy-z-fold3-...\n" +
                        "Hot Sale thiết bị y tế phòng Covid-19:\n" +
                        "\uD83D\uDD17 https://didongviet.vn/thiet-bi-y-te\n" +
                        "<br/> \n" +
                        "Điện thoại học online giá rẻ, smartphone học online giá rẻ, hay tablet học online giá rẻ đã trở thành cụm từ được tìm kiếm bậc nhất trong những tuần vừa qua. Ngày tựu trường đã trở lại, không phải quý vị phụ huynh nào cũng có điều kiện sắm cho con em mình những thiết bị smartphone hoặc tablet đắt tiền. Dưới 5 triệu, những lựa chọn hàng đầu sẽ bao gồm Nokia, Xiaomi - POCO - Redmi, realme và cả Vsmart.\n" +
                        "<br/> \n" +
                        "Xin trân trọng cảm ơn nền tảng đánh giá hiệu năng WeTest PerfDog (Full mobile platform performance test and analysis tool) - Download & thông tin chi tiết tại:\n" +
                        "\uD83D\uDD17 https://perfdog.wetest.net\n" +
                        "\uD83D\uDD17https://www.wetest.net/pltfms/view/we...",
                0,
                0,
                "https://i.ytimg.com/vi/Pu8M2sYa5jw/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAP3J68SEI7eJMoELPSjW-dyQCnoQ",
                18,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Lookback MacBook Pro sau 12 năm còn có 4 TRIỆU!\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/zq7qQpvQIx4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                32793,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#MacBookPro #MacBook #ReLab",
                "Lookback MacBook Pro sau 12 năm còn có 4 TRIỆU!\n" +
                        "Tham khảo giá bán các dòng MacBook, iPad, iPhone tại:\n" +
                        "\uD83D\uDD17 https://shopdunk.com/mac/\n" +
                        "\uD83D\uDD17 https://shopdunk.com/iphone/\n" +
                        "<br/> \n" +
                        "MacBook Pro giá chỉ 4 triệu thì có gì nhỉ? Có tuổi các bạn ạ \uD83E\uDD23 MacBook Pro Mid 2009 với cấu hình rất cũ như Intel Core 2 Duo, NVIDIA Geforce 9400M, 4GB RAM chỉ đủ đáp ứng những nhu cầu cơ bản như lướt web, học online, làm việc gõ văn bản nhẹ nhàng. Bàn phím MacBook Pro Mid 2009 gõ rất sướng với hành trình phím sâu, độ nảy cao, touchpad phủ kính vuốt mượt mà. Điểm mạnh của những chiếc MacBook siêu cũ như bản Mid 2009 này là có rất nhiều cổng kết nối, có cả đầu đọc đĩa quang CD, USB Type-A, đầu đọc thẻ nhớ SD, jack ethernet RJ45, v.v\n" +
                        "<br/> \n" +
                        "Phần mềm đánh giá hiệu năng, đo FPS Wetest Perfdog - Download và dùng thử MIỄN PHÍ ngay tại:\n" +
                        "\uD83D\uDD17 https://www.wetest.net/?utm_source=yt... \n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "Thực hiện\n" +
                        "Quay phim | Hậu kỳ: Linh Trần\n" +
                        "Dẫn | Reviewer: @Thành Thử \n" +
                        "Nội dung: @Thành Thử \n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "Tags:\n" +
                        "đánh giá smartphone,relab,tuấn ngọc,review điện thoại,review smartphone,đánh giá điện thoại,công nghệ,thành thật thà,macbook pro,laptop sinh viên,laptop cao cấp,macbook pro mid 2009,macbook 2009,đánh giá macbook pro 2009,giá bán macbook pro 2009,review macbook pro 2009,macbook pro 2009 giá bao nhiêu,laptop cũ,macbook pro cũ,macbook cũ,có nên mua macbook cũ,laptop văn phòng,macbook giá rẻ,macbook giá tốt\n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "Menu\n" +
                        "00:00 Intro\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "ReLab là kênh truyền thông đánh giá chuyên sâu các sản phẩm công nghệ, mang lại cái nhìn khách quan và chính xác, giúp các bạn đưa ra lựa chọn dễ dàng hơn trước khi quyết định mua. Đừng quên bấm LIKE, SUBSCRIBE và BẤM CHUÔNG để không bỏ lỡ bất kì video nào nhé. ✌\n" +
                        "<br/> \n" +
                        "\uD83D\uDCE7 Email liên hệ hợp tác: ads@navimedia.com.vn\n" +
                        "\uD83D\uDCE7 Contact for work: ads@navimedia.com.vn\n" +
                        "<br/> \n" +
                        "© Bản quyền thuộc về NAVI MEDIA & RELAB.\n" +
                        "© Copyright by NAVI MEDIA & RELAB. Please do not Re-up.",
                0,
                0,
                "https://i.ytimg.com/vi/zq7qQpvQIx4/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCx-VspnihIZe3WW3Z_HaVJJZOy9g",
                19,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "5 CUỐN SÁCH THAY ĐỔI CÁCH NHÌN CUỘC SỐNG CỦA BẠN | 5 books to read now...",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/nVztbNncPME\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                23743,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#sachthaydoicuocsong #trietlycuocsong #hakhuat",
                "Mng ơi mình đã quay trở lại vs chiếc clip review sách hay đây, mong là mng enjoy nhaaaa\n" +
                        "Những cuốn sách Hà đề cập trong clip: \n" +
                        "1. Luật Tâm thức : https://shp.ee/3qrj5rx\n" +
                        "2. 101 essays that will change the way you think \n" +
                        "3. Hảo nữ trung hoa: https://shp.ee/t7t5y8f\n" +
                        "4. Ung thu Sự thật và tin đồn\n" +
                        "5. Cởi trói linh hồn: https://shp.ee/bidbvtf\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "CÁC CHẾ TÌM MÌNH Ở ĐÂY NHA:\n" +
                        "\uD83D\uDC49\uD83D\uDC49\uD83D\uDC49Insta của mình nha: rachelkhuat_\n" +
                        "\uD83D\uDC49\uD83D\uDC49\uD83D\uDC49Email: habon1210@gmail.com\n" +
                        "\uD83D\uDC49\uD83D\uDC49\uD83D\uDC49Goodread: https://goo.gl/1HqcdD\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "My background music: \n" +
                        "► Music Credit: LAKEY INSPIRED\n" +
                        "Track Name: \"Better Days\"<br/> \n" +
                        "Music By: LAKEY INSPIRED @ \n" +
                        "► Music Credit: Dj Quads\n" +
                        "Track Name: \"It's Near\"<br/> \n" +
                        "► Music Credit: Artificial.Music\n" +
                        "Track Name: \"And So It Begins\"<br/> \n" +
                        "License for commercial use: Creative Commons Attribution 3.0 Unported CC BY 3.0 License.\n" +
                        "Full License HERE - https://creativecommons.org/licenses/...\n" +
                        "Music promoted by NCM https://goo.gl/fh3rEJ\n" +
                        "<br/> \n" +
                        "* Bấm Đăng ký/Subscrie để theo dõi mình nha các chế !\n" +
                        "☆ ĐĂNG KÝ/SUBSCRIBE: http://bit.ly/HaKhuat\n" +
                        "#sachthaydoicuocsong #trietlycuocsong #hakhuat\n" +
                        "================================\n" +
                        "© Bản quyền thuộc về Hà Khuất\n" +
                        "© Copyright by Hà Khuất ☞ Do not Reup",
                0,
                0,
                "https://i.ytimg.com/vi/nVztbNncPME/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDSclcf8TwzdSiCKB1Yw2Z3-i_pHw",
                20,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "3 cuốn trinh thám SIÊU HAYYYY | Ai rồi cũng phải đọc trinh thám thôi | Hà Khuất",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/sjDi36nnbps\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                18401,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#sachtrinhtham #sachhay #hakhuat",
                "Helu các bác sau một khoảng thời gian nhận được quá nhiều recommendation của các bác thì t cx chính thức lọt hố trinh thám ạ, và đây là 3 cuốn mị rất tâm đắc thời gian qua, mong mng enjoy nhaa....\n" +
                        "<br/> \n" +
                        "NHỮNG CÂU HỎI CÁC BẠN HAY HỎI MÌNH: \n" +
                        "1. mình quay bằng máy gì: canon m100 nha \n" +
                        "2. mình edit bằng: adobe premiere 2020 nha \n" +
                        "3. mình thường mua sách ở: Tiki, Fahasa \n" +
                        "4. đồ mình đang mặc: Uniqlo\n" +
                        "5. son mình đang dùng: 3CE Smoked rose nha \n" +
                        "<br/> \n" +
                        "* Bấm Đăng ký/Subscrie để theo dõi mình nha các chế !\n" +
                        "☆ ĐĂNG KÝ/SUBSCRIBE: http://bit.ly/HaKhuat\n" +
                        "#sachtrinhtham #sachhay #hakhuat #thamtu\n" +
                        "================================\n" +
                        "© Bản quyền thuộc về Hà Khuất\n" +
                        "© Copyright by Hà Khuất ☞ Do not Reup",
                0,
                0,
                "https://i.ytimg.com/vi/sjDi36nnbps/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCfiUijpcR0P7WHZlxhLxPxIkIebQ",
                20,
                4,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: review */

        /* begin: film */
        videos.add(new Video(
                "DIỆP VẤN 3 [Thuyết Minh] | Chung Tử Ðơn, Mike Tyson | Phim Võ Thuật Hành Động Kinh Điển Nhất",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/5kJz1TmbTb8?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                16150991,
                Timestamp.valueOf("2021-10-27 23:00:00.00"),
                "##phimvõthuật #chungtửđơn #kungfu",
                "DIỆP VẤN 3 | Chung Tử Ðơn, Mike Tyson | Phim Võ Thuật Hành Động Thuyết Minh.\n" +
                        "\n" +
                        "Diệp Vấn 3 “ Trận Chiến Cuối Cùng ” – Phim thuộc thể loại hành động do Trung Quốc sản xuất câu chuyện nói về một nhân vật quan trọng trong nền võ thuật của Trung Quốc, Phim khắc hoạ lại hình ảnh thầy trò của Diệp Vấn và Lý Tiểu Long, bên cạnh đó phim còn có sự khai thác mới giữa Diệp Vấn đối đầu với một võ sĩ huyền anh của Mỹ, bên cạnh đó điểm hấp dẫn nhất là nhà sản xuất dùng công nghệ làm nhân vật huyền thoại Lý Tiểu Long sống lại và còn có sự góp mặt của tay đấm huyền anh thế giới Mike Tyson. Trong những cảnh quay Chân Tử Đan tự diễn những pha hành động mà không nhờ thế thân nên bộ phim trở nên rất thiết thật và có tính chân thật khiến người xem thích thú. Chung Tử Đơn sẽ vào vai diệp vấn…!!!\n" +
                        "\n" +
                        "#phimvõthuật #chungtửđơn #kungfu\n" +
                        "\n" +
                        "Chân thành cảm ơn các nhãn hàng đã tài trợ: #pepsi #shopee #lazada #tiki #samsung #iphone #apple #Microsoft #Amazon #Nestle #Unilever #Gojek #Bee #Honda #Yamaha #Toyota",
                32208,
                6547,
                "https://i.ytimg.com/vi/5kJz1TmbTb8/maxresdefault.jpg",
                6,
                5,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "DIỆP VẤN [Thuyết Minh] | Chung Tử Đơn, Nhậm Đạt Hoa | Phim Võ Thuật Kungfu Đỉnh Cao Mãn Nhãn Nhất",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/pTYa27TLyxM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                13438719,
                Timestamp.valueOf("2019-09-24 18:00:00.00"),
                "#phimhànhđộng #phimvõthuật #chungtửđơn",
                "DIỆP VẤN [Thuyết Minh] | Chung Tử Đơn, Nhậm Đạt Hoa - Phim Võ Thuật Kungfu Vịnh Xuân Quyền.\n" +
                        "\n" +
                        "Diệp Vấn bấy giờ được mọi người cho là cao thủ bậc nhất của Vịnh Xuân Quyền. Lưu sư phụ mới mở một lò võ và muốn đến Diệp gia xin 'chỉ giáo' trong một trận đấu bí mật. Diệp Vấn đã chiến thắng một cách dễ dàng, tăng thêm sự ngưỡng mộ của mọi người đối với anh. Không lâu sau, một tên thảo khấu tên là Kim Sơn Trảo cùng bè lũ đến vùng Phật Sơn, hắn cho rằng nếu đấu võ thắng Diệp Vấn, hắn sẽ được người dân ủng hộ và xin theo học võ công. Nhưng Diệp Vấn đã “dạy dỗ” Sơn Trảo bằng bốn môn công phu của Vĩnh Xuân là quyền, cước, liễu diệp đao, và côn thẳng như vậy...?\n" +
                        "\n" +
                        "#phimhànhđộng #phimvõthuật #chungtửđơn\n" +
                        "\n" +
                        "Chân thành cảm ơn các nhãn hàng đã tài trợ: #pepsi #shopee #lazada #tiki #samsung #iphone #apple #Microsoft #Amazon #Nestle #Unilever #Gojek #Bee #Honda #Yamaha #Toyota",
                37740,
                5102,
                "https://i.ytimg.com/vi/pTYa27TLyxM/maxresdefault.jpg",
                6,
                5,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "CUỒNG THÚ [Thuyết Minh] | Phim Võ Thuật Hành Động Kungfu Hay Nhất",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/9Tp2PXLh2AQ?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                5566634,
                Timestamp.valueOf("2019-10-26 20:00:00.00"),
                "#PHIMVÕTHUẬT #PHIMHÀNHĐỘNG #KUNGFU",
                "CUỒNG THÚ | Phim Hành Động Võ Thuật Kungfu Kinh Điển Nhất Thuyết Minh.\n" +
                        "\n" +
                        "Nội dung: Phim Cuồng Thú kể về câu chuyện huynh đệ tương tàn, cảnh sát và bọn cướp trong sự cám dỗ của tiền bạc. Mời các bạn đón xem diễn biến của tập phim sẽ diễn ra như thế nào nhé! Chúc các bạn một ngày vui vẻ ^^!\n" +
                        "\n" +
                        "#PHIMVÕTHUẬT #PHIMHÀNHĐỘNG #KUNGFU",
                7658,
                1952,
                "https://i.ytimg.com/vi/9Tp2PXLh2AQ/maxresdefault.jpg",
                6,
                5,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "PHIM HÀNH ĐỘNG XHĐ SÁT THỦ NẰM VÙNG | TINH ANH PHI HỔ | Võ Thuật Chiếu Rạp Hay Nhất",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/csjuHllTGi8?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                40959,
                Timestamp.valueOf("2021-11-06 21:30:00.00"),
                "#phimhànhđộng #phimvõthuật #phimchiếurạp",
                "Phim Hành Động Võ Thuật Siêu Sát Thủ Hay Nhất Chiếu Rạp | Tinh Anh Phi Hổ - Ngô Mạnh Đạt, Trịnh Tú Văn.\n" +
                        "\n" +
                        "Sau cái chết của con trai mình, Bi Nhỏ(Ngô Mạnh Đạt) đã để đứa con trai còn tham gia vào một nhóm cảnh sát ưu tú được gọi là \"Phi Hổ\" và tìm hiểu ý nghĩa thực sự của công lý. \n" +
                        "\n" +
                        "#phimhànhđộng #phimvõthuật #phimchiếurạp #sátthủ #ngômạnhđạt #phimhay #phimmới",
                96,
                22,
                "https://i.ytimg.com/vi/csjuHllTGi8/maxresdefault.jpg",
                6,
                5,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "SÁT THỦ THỢ MÁY - JASON STATHAM - Phim Hành Động Võ Thuật Mỹ Chiếu Rạp Thuyết Minh",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/b1L2Cf5_Cew?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                957499,
                Timestamp.valueOf("2021-10-12 23:00:00.00"),
                "#unimovie #phimhanhdong #phimvothuat",
                "SÁT THỦ THỢ MÁY - JASON STATHAM - Phim Hành Động Võ Thuật Mỹ Chiếu Rạp Thuyết Minh\n" +
                        "<br/> \n" +
                        "⭐UNI MOVIE - Nơi hội tụ những bộ phim hành động võ thuật, phim chiếu rạp Mỹ Trung Quốc thuyết minh mới nhất, hay nhất, hấp dẫn nhất 2020.\n" +
                        "⭐UNI MOVIE - Kho phim của mọi nhà! \uD83D\uDD14 \n" +
                        "\uD83D\uDD14 Đăng ký kênh và nhấn chuông thông báo để đón xem những tập phim hay nhất:https://www.youtube.com/UniMovie?sub_confirmation=1" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Giao lưu với Uni Movie qua Fanpage - Nơi quy tụ những anh hùng chân chính:https://www.facebook.com/unimoviestar" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Tik Tok Uni Movie: https://www.tiktok.com/@unimovie" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Uni Movie - Kho Phim Của Mọi Nhà:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYrCq-cApgNiK2exuihI27I\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Kiếm Hiệp Mới Hay Nhất:https://www.youtube.com/PhimKiemHiepOfficial?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Drama, Ngôn Tình Mới Hay Nhất:https://www.youtube.com/UniDrama?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Hành Động Chiếu Rạp Mỹ:https://www.youtube.com/HDMovieStar?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Võ Thuật Chiếu Rạp Mỹ:https://www.youtube.com/SKLMovie?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Chiến Tranh Mỹ Trung Quốc Thuyết Minh Hay Nhất:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYRtdJx5a6WuxLfz9-Ocuzs\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Võ Thuật Mỹ Trung Quốc 2020 Thuyết Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZbUQoPT77p9aRwI17xnVVl\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Chiếu Rạp Mỹ Mới Hay Nhất 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaebaHNVSkv5opKOuLOg52U2y\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Khoa Học Viễn Tưởng Chiếu Rạp Mỹ 2020 Thuyết Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYEpsmphokgeyKt0NjkV7ZX\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng Hợp Phim Hành Động Kinh Dị Chiếu Rạp Mỹ 2020 Thuyết Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeY_tK8tmmIyaLCs1Ag7sWHi\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Tâm Lý Tinh Cảm Lãng Mạn Âu Mỹ Hay Nhất 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZ56cDFyw-skOgChbTInOtS\n" +
                        "<br/> \n" +

                        "-------- ❤ ---------\n" +
                        "© Bản quyền thuộc về UNI MOVIE. Không Reup dưới mọi hình thức!\n" +
                        "<br/> \n" +
                        "#unimovie #phimhanhdong #phimvothuat #phimhanhdongthuyetminh #phimthuyetminh #phimchieurap #phim #phimmoi #phimhay #phimmoi2020 #phimhay2020",
                8027,
                276,
                "https://i.ytimg.com/vi/b1L2Cf5_Cew/maxresdefault.jpg",
                7,
                5,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "BIỂN CÁ MẬP - Phim Hành Động Chiếu Rạp Kịch Tính Thuyết Minh",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MblP1p1NaOY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                19624,
                Timestamp.valueOf("2021-11-10 23:00:00.00"),
                "#unimovie #phimhanhdong #phimvothuat",
                "BIỂN CÁ MẬP - Phim Hành Động Chiếu Rạp Kịch Tính Thuyết Minh\n" +
                        "<br/> \n" +
                        "⭐UNI MOVIE - Nơi hội tụ những bộ phim hành động võ thuật, phim chiếu rạp Mỹ Trung Quốc thuyết minh mới nhất, hay nhất, hấp dẫn nhất 2020.\n" +
                        "⭐UNI MOVIE - Kho phim của mọi nhà! \uD83D\uDD14 \n" +
                        "\uD83D\uDD14 Đăng ký kênh và nhấn chuông thông báo để đón xem những tập phim hay nhất:https://www.youtube.com/UniMovie?sub_confirmation=1" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Giao lưu với Uni Movie qua Fanpage - Nơi quy tụ những anh hùng chân chính:https://www.facebook.com/unimoviestar" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Tik Tok Uni Movie: https://www.tiktok.com/@unimovie" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Uni Movie - Kho Phim Của Mọi Nhà:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYrCq-cApgNiK2exuihI27I\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Kiếm Hiệp Mới Hay Nhất:https://www.youtube.com/PhimKiemHiepOfficial?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Drama, Ngôn Tình Mới Hay Nhất:https://www.youtube.com/UniDrama?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Hành Động Chiếu Rạp Mỹ:https://www.youtube.com/HDMovieStar?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Võ Thuật Chiếu Rạp Mỹ:https://www.youtube.com/SKLMovie?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Chiến Tranh Mỹ Trung Quốc Thuyết Minh Hay Nhất:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYRtdJx5a6WuxLfz9-Ocuzs\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Võ Thuật Mỹ Trung Quốc 2020 Thuyết Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZbUQoPT77p9aRwI17xnVVl\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Chiếu Rạp Mỹ Mới Hay Nhất 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaebaHNVSkv5opKOuLOg52U2y\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Hành Động Khoa Học Viễn Tưởng Chiếu Rạp Mỹ 2020 Thuyết Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYEpsmphokgeyKt0NjkV7ZX\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng Hợp Phim Hành Động Kinh Dị Chiếu Rạp Mỹ 2020 Thuyết Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeY_tK8tmmIyaLCs1Ag7sWHi\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Tổng hợp Phim Tâm Lý Tinh Cảm Lãng Mạn Âu Mỹ Hay Nhất 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZ56cDFyw-skOgChbTInOtS\n" +
                        "<br/> \n" +

                        "-------- ❤ ---------\n" +
                        "© Bản quyền thuộc về UNI MOVIE. Không Reup dưới mọi hình thức!\n" +
                        "<br/> \n" +
                        "#unimovie #phimhanhdong #phimvothuat #phimhanhdongthuyetminh #phimthuyetminh #phimchieurap #phim #phimmoi #phimhay #phimmoi2020 #phimhay2020",
                814,
                6,
                "https://i.ytimg.com/vi/MblP1p1NaOY/maxresdefault.jpg",
                7,
                5,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "PHIM MỚI 2021 | PHI VỤ TIỀN GIẢ | Châu Nhuận Phát | Phim Hành Động Võ Thuật Chiếu Rạp Thuyết Minh",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/_fZzEssjPBc?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                4616402,
                Timestamp.valueOf("2020-09-04 07:00:00.00"),
                "#phimhanhdong #phimthuyetminh #phimvothuat",
                "Phi Vụ Tiền Giả - Châu Nhuận Phát - Quách Phú Thành là phim hành động võ thuật, phim hay 2019 thuyết minh, phim chiếu rạp, phim hay 2020 thuyết minh.\n" +
                        "Nội dung chính:\n" +
                        "Cảnh sát Hồng Kông đã phá vỡ một phi vụ tiền giả động trời và bắt được Lee Man, một thành viên chủ chốt của đường dây tiền giả khi hắn đang chạy trốn sang Thái Lan. Các thanh tra cảnh sát đang nỗ lực tìm ra chân tưóng của Painter, kẻ chủ mưu đứng đầu băng đảng làm tiền giả từ lời khai của Lee Man.\n" +
                        "Bất chấp sự truy đuổi mạnh mẽ của cảnh sát, băng đảng của Painter lừa mua được giấy in tiền và cướp được một xe tải chở mực bảo mật để sản xuất hàng loạt các tờ tiền đô giả có thể qua mặt được cả những chuyên gia tiền tệ. Sở cảnh sát nhận ra họ phải đối mặt với một kẻ thù mạnh hơn họ tưởng...\n" +
                        "----------❤️----------\n" +
                        "<br/> \n" +
                        "⭐UNI MOVIE - Nơi hội tụ những bộ phim hành động võ thuật, phim chiếu rạp Mỹ Trung Quốc thuyết minh mới nhất, hay nhất, hấp dẫn nhất 2020.\n" +
                        "⭐UNI MOVIE - Kho phim của mọi nhà! \uD83D\uDD14 \n" +
                        "\uD83D\uDD14 Đăng ký kênh và nhấn chuông thông báo để đón xem những tập phim hay nhất:https://www.youtube.com/UniMovie?sub_confirmation=1" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Giao lưu với Uni Movie qua Fanpage - Nơi quy tụ những anh hùng chân chính:https://www.facebook.com/unimoviestar" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Tik Tok Uni Movie: https://www.tiktok.com/@unimovie" +
                        "<br/> \n" +
                        "----------❤️----------\n" +
                        "\uD83D\uDCFA Tổng hợp Phim Hành Động Chiếu Rạp Mỹ Mới Hay Nhất 2020:https://www.youtube.com/watch?v=3CDjrz2zfG0&list=PLzQmA4UVLaebaHNVSkv5opKOuLOg52U2y&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA Tổng hợp Phim Hành Động Võ Thuật Mỹ Trung Quốc 2020 Thuyết Minh:https://www.youtube.com/watch?v=XXBpXCKvAy0&list=PLzQmA4UVLaeZbUQoPT77p9aRwI17xnVVl&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA Tổng Hợp Phim Hành Động Kinh Dị Chiếu Rạp Mỹ 2020 Thuyết Minh:https://www.youtube.com/watch?v=fIXW368w1Lw&list=PLzQmA4UVLaeY_tK8tmmIyaLCs1Ag7sWHi&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA Tổng hợp Phim Hành Động Khoa Học Viễn Tưởng Chiếu Rạp Mỹ 2020 Thuyết Minh:https://www.youtube.com/watch?v=36f7YVhEKVc&list=PLzQmA4UVLaeYEpsmphokgeyKt0NjkV7ZX&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA Tổng hợp Phim Tâm Lý Tinh Cảm Lãng Mạn Âu Mỹ Hay Nhất 2020:https://www.youtube.com/watch?v=SfiIPktCOEk&list=PLzQmA4UVLaeZ56cDFyw-skOgChbTInOtS&t=0s\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC BIỆT KÍCH NGẦM | Phim Hành Động Võ Thuật Chiếu Rạp Mỹ Thuyết Minh Mới Hay Nhất:\n" +
                        "https://www.youtube.com/watch?v=vO5fq...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC CUỒNG NỘ - FURY | Brad Pitt | Phim Hành Động Chiến Tranh Chiếu Rạp Mỹ 2019 Thuyết Minh:\n" +
                        "https://www.youtube.com/watch?v=0Bfv2...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC SÁT THỦ CHUYÊN NGHIỆP - Jason Statham | Phim Hành Động Võ Thuật Chiếu Rạp Mỹ 2019 Thuyết Minh:\n" +
                        "https://www.youtube.com/watch?v=dbCBh...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC ĐIỆP VỤ TAM GIÁC VÀNG | Phim Hành Động Võ Thuật Chiếu Rạp Trung Quốc 2019 Thuyết Minh:\n" +
                        "https://www.youtube.com/watch?v=aphxJ...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC NGƯỜI TÙ KHỔ SAI | Phim Hành Động Hình Sự Chiếu Rạp Mỹ 2020 Thuyết Minh:\n" +
                        "https://www.youtube.com/watch?v=68E1O...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC TRỢ LÝ HẾT Ý - The UPSIDE - Phim Hành Động Hài Âu Mỹ Chiếu Rạp Hay Nhất 2020 - Uni Movie:\n" +
                        "https://www.youtube.com/watch?v=-AsU2...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC KHÔNG GIAN MÊ HOẶC - ATTRACTION - Phim Hành Động Chiếu Rạp Khoa Học Viễn Tưởng Hay Nhất 2020:\n" +
                        "https://www.youtube.com/watch?v=C63Ze...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC CHIẾN BINH FRANKENSTEIN - Phim Hành Động Khoa Học Viễn Tưởng Chiếu Rạp Mỹ Vietsub Mới Hay Nhất 2020:\n" +
                        "https://www.youtube.com/watch?v=QM4H7...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC NHỌ GẶP HÊN - Phim Hài Hành Động Chiếu Rạp Mỹ Mới Hay Nhất 2020:\n" +
                        "https://youtu.be/IUIZBrJEeiw\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC CHIẾN BINH MEXICO - Phim Bom Tấn Hành Động Mỹ Chiếu Rạp Mới Hay Nhất 2020:\n" +
                        "https://www.youtube.com/watch?v=65eYb...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC SÓNG DỮ | Lưu Đức Hoa, Ngô Trác Hy | Phim Hành Động Chiếu Rạp 2020 Thuyết Minh:\n" +
                        "https://www.youtube.com/watch?v=3CDjr...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC ĐIỆP VỤ TỐI MẬT | Phim Hành Động Võ Thuật Hình Sự Chiếu Rạp Trung Quốc 2020 Thuyết Minh:\n" +
                        "https://www.youtube.com/watch?v=4EBpf...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC THANH TRỪNG - Phim Hành Động Võ Thuật Chiếu Rạp Trung Quốc 2020 Thuyết Minh:\n" +
                        "https://www.youtube.com/watch?v=BKexG...\n" +
                        "----------❤️---------- \n" +
                        "© Bản quyền thuộc về UNI MOVIE. Không Reup dưới mọi hình thức!\n" +
                        "<br/> \n" +
                        "#unimovie #phimhanhdong #phimvothuat #phimhanhdongthuyetminh #phimthuyetminh #phimchieurap #phim #phimmoi #phimhay #phimmoi2020 #phimhay2020",
                1920,
                241,
                "https://i.ytimg.com/vi/_fZzEssjPBc/maxresdefault.jpg",
                7,
                5,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: film*/

        /* begin: education*/
        videos.add(new Video(
                "Cách Dễ Nhất Để Học Giỏi (Dù cho bận rộn)",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/vIk5zZ3YA38?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                213207,
                Timestamp.valueOf("2021-10-01 18:00:00.00"),
                "#web5ngay #bhth #baihoctamhuyet",
                "Lịch phát sóng:\n" +
                        "\uD83D\uDFE1 7h tối thứ 7️⃣: Bài học tâm huyết.\n" +
                        "\uD83D\uDFE0 7h tối thứ 3️⃣: Video Tri kỷ cảm xúc.\n" +
                        "\uD83D\uDFE2 7h tối thứ 5️⃣: Bài học siêu ngắn.\n" +
                        "Các bạn nhớ đón xem nghen!" +
                        "<br/> \n" +
                        "#web5ngay #bhth #baihoctamhuyet",
                15612,
                156,
                "https://i.ytimg.com/vi/vIk5zZ3YA38/maxresdefault.jpg",
                8,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "5 Bài Học Vô Giá Đã Cứu Sống Đời Tôi | Web5ngay",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/LSFpJOFHw1A?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                469912,
                Timestamp.valueOf("2021-06-26 18:00:00.00"),
                "#web5ngay #bhth #baihoctamhuyet",
                "\uD83D\uDFE1 Trở thành fanVIP: https://www.youtube.com/channel/UCkgjUHB8sdWbmdp39swMrTg \n" +
                        "Mến chào tất cả quý vị và các bạn. \n" +
                        "Hiện tại, thì tui đã up hơn 300 video lên kênh Web5ngay Việt Nam rồi. \n" +
                        "300 video thì khá là dài. Và có lẽ sẽ có nhiều bạn mong muốn 1 video tổng hợp tất cả những gì tinh túy nhất đứng đằng sau hơn 300 bài đó. \n" +
                        "Ok, tui làm thôi hihi.\n" +
                        "10 bài học tinh túy nhất trong học viện hơn 300 video, sẽ tổng hợp lại trong duy nhất 1 bài này.\n" +
                        "10 bài học hày, ko chỉ gắn liền với hơn 300 video, mà còn gắn liền với cuộc đời nhân quả của tôi nữa.\n" +
                        "Những khi buồn, những ngày nghèo khổ, những lúc cự kỳ tuyệt vọng, những lúc bị người khác coi thường, nếu ko có 10 bài học này, thì ko biết đời tôi giờ thế nào luôn đó. \n" +
                        "Xin mạn phép gọi đây là: 5 bài học vô giá đã cứu sống đời tôi. \n" +
                        "Và xin cảm ơn tất cả nhưng cơ duyên, kinh nghiệm, và kiến thức khoa học mà tôi học được, đã giúp nâng cấp đời tôi.\n" +
                        "<br/> \n" +
                        "Bố cục:\n" +
                        "0:00 Yêu các bạn\n" +
                        "1:32 Bài học 1\n" +
                        "8:30 Bài học 2\n" +
                        "14:10 Bài học 3\n" +
                        "20:22 Bài học 4\n" +
                        "28:03 Bài học 5\n" +
                        "<br/> \n" +
                        "#bhth #web5ngay #baihoc #kienthuc\n",
                28667,
                345,
                "https://i.ytimg.com/vi/LSFpJOFHw1A/maxresdefault.jpg",
                8,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Chữa bệnh “Không mục đích, không đam mê, ko biết đời mình về đâu”",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/1kseOrqyeqE?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                745274,
                Timestamp.valueOf("2021-06-05 18:00:00.00"),
                "#bhth",
                "\uD83D\uDFE1 Trở thành fanVIP: https://www.youtube.com/channel/UCkgjUHB8sdWbmdp39swMrTg \n" +
                        "Chữa bệnh “Không mục đích, không đam mê, ko biết đời mình về đâu”\n" +
                        "Chapters:\n" +
                        "0:00 Câu hỏi quan trọng \n" +
                        "04:21 Chẩn\n" +
                        "17:21 Chữa\n" +
                        "#bhth",
                37087,
                480,
                "https://i.ytimg.com/vi/1kseOrqyeqE/maxresdefault.jpg",
                8,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Vì sao Đọc Sách có thể thay đổi đời bạn (giàu có, khôn ngoan, nổi tiếng)",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/9vj2c78gBNw?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                154997,
                Timestamp.valueOf("2021-10-30 18:00:00.00"),
                "#web5ngay",
                "Vì sao Đọc Sách có thể thay đổi đời bạn (giàu có, khôn ngoan, nổi tiếng)",
                8528,
                96,
                "https://i.ytimg.com/vi/9vj2c78gBNw/maxresdefault.jpg",
                8,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "HỌC BÀI CÙNG MÌNH NHÉ! // study with me #7 (real time, with piano bgm) // jawonee",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MJJYkkmE1lM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                731634,
                Timestamp.valueOf("2020-12-13 18:00:00.00"),
                "#jawonee",
                "\uD83D\uDCD6 cốc cốc! Cậu có đang ôn thi hong? Nếu đang ôn thi thì hãy vào đây học chung với tớ nha! Mong là video này của mình sẽ giúp cậu học tập trung hơn, hiệu quả hơn nha. Sắp thi rồi, đừng áp lực quá. Mình ở đây và yêu thương cậu\n" +
                        "<br/> \n" +
                        "\uD83D\uDCD6  Một vài món đồ trong video:\n" +
                        "<br/> \n" +
                        "Bàn học: https://jangin.vn/shop/bo-ban-hoc-h-t...\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Đồng hồ đèn LED: https://shp.ee/ewjqisd\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Giá đỡ sách: https://shp.ee/4a7h8dd\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Tập Klong math notebook: https://shp.ee/gbfwfbf\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Đồng hồ bấm giờ: https://shp.ee/hq6peav\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Bút máy: https://shp.ee/kriyx2x\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Tombow dual brush pen: https://shp.ee/rq99q47\n" +
                        " / https://shp.ee/j9tjwp7\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Zebra Mildliner màu Violet: https://shp.ee/2umwh67\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Bút gel Kaco: https://shp.ee/i8hqn57\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "\uD83D\uDCD6 Music/Âm nhạc trong video\n" +
                        "<br/> \n" +
                        "1) A Quiet Thought | Wayne Jones | https://www.youtube.com/audiolibrary_...\n" +
                        "<br/> \n" +
                        "2) Watercolor Lilies | Aaron Kenny | https://www.youtube.com/audiolibrary_...\n" +
                        "<br/> \n" +
                        "3) Falling Snow | Aakash Gandhi | https://www.youtube.com/audiolibrary_...\n" +
                        "<br/> \n" +
                        "4) Touching Moment | Wayne Jones | https://www.youtube.com/audiolibrary_...\n" +
                        "<br/> \n" +
                        "5) Anton | Dan Bodan | https://www.youtube.com/audiolibrary_...\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "\uD83D\uDCD6 Những điều mà bạn có thể hỏi mình:\n" +
                        "<br/> \n" +
                        "1. Bạn tên gì? Bao nhiêu tuổi?\n" +
                        "- Mình là Nguyên, bạn cũng có thể gọi mình là Jawon, Mình sinh năm 2004 ^^\n" +
                        "<br/> \n" +
                        "2. Bạn edit video bằng app gì?\n" +
                        "- Mình edit bằng VLLO, VITA, Inshot, SNOW\n" +
                        "<br/> \n" +
                        "3. Bạn làm thumbnail bằng app gì?\n" +
                        "- Mình làm thumbnail bằng Sketchbook và Phonto\n" +
                        "<br/> \n" +
                        "4. Bạn sử dụng dụng cụ gì để quay?\n" +
                        "- Mình dùng Samsung Galaxy Note10 và Tripod YF-3388\n" +
                        "<br/> \n" +
                        "5. Vì sao bạn lại tạo ra channel này?\n" +
                        "<br/> \n" +
                        "- Vì mình muốn chia sẻ những kinh nghiệm học tập đồng thời truyền cảm hứng học tập cho mọi người!\n" +
                        "<br/> \n" +
                        "6. Vì sao bạn không lồng tiếng cho video?\n" +
                        "<br/> \n" +
                        "- Vì giọng nói không phải là thế mạnh của mình và trên hết đây là phong cách mình muốn theo đuổi, hiện tại mình vẫn rất hài lòng về nó ^^\n" +
                        "<br/> \n" +
                        "\uD83D\uDCD6 Kết nối với mình nhé: \n" +
                        "<br/> \n" +
                        "Instagram: @jawonee._\n" +
                        "<br/> \n" +
                        "Facebook: https://www.facebook.com/Jawonee-5760\n" +
                        "...\n" +
                        "<br/> \n" +
                        "-------\n" +
                        "<br/> \n" +
                        "study with me study motivation học cùng mình học tập hiệu quả study inspiration học văn cùng mình học tiếng anh cách ôn thi hiệu quả",
                16333,
                161,
                "https://i.ytimg.com/vi/MJJYkkmE1lM/maxresdefault.jpg",
                9,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "HỌC BÀI CÙNG MÌNH // study with me #8 (real time, with piano music) // jawonee",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/pITmw14bvpM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                450927,
                Timestamp.valueOf("2021-02-17 18:00:00.00"),
                "#jawonee",
                "\uD83C\uDF3B Chắc mọi người cũng bắt đầu quay lại học tập rồi nhỉ? Dù là đến trường hay học online thì bọn mình hãy cùng nhau cố gắng nha!!! Mình mong là video này sẽ giúp bạn học tập trung hơn.\n" +
                        "<br/> \n" +
                        "\uD83C\uDF3B Thông tin sản phẩm\n" +
                        "<br/> \n" +
                        "Bút Tombow dual brush pen - màu 993: https://shp.ee/jz6bycg\n" +
                        "<br/> \n" +
                        "Bút Kaco pure: https://shp.ee/zdmbtv9 \n" +
                        "<br/> \n" +
                        "Bút Zebra Mildliner - màu Gold: https://shp.ee/ugzi84d\n" +
                        "<br/> \n" +
                        "Bút brush Baoke - ngòi S22: https://shp.ee/gbf92wj\n" +
                        "<br/> \n" +
                        "Mình dùng tập phát thưởng của trường nhé.\n" +
                        "<br/> \n" +
                        "\uD83C\uDF3B Âm nhạc trong video\n" +
                        "<br/> \n" +
                        "Piano playist: https://youtu.be/CZuWuAQZd-k\n" +
                        "<br/> \n" +
                        "Awaiting Return - Atlantean Twilight by Kevin MacLeod is licensed under a Creative Commons Attribution license (https://creativecommons.org/licenses/...)\n" +
                        "Source: https://incompetech.com/music/royalty-...\n" +
                        "Artist: https://incompetech.com/\u200B \n" +
                        "<br/> \n" +
                        "Cylinder Six by Chris Zabriskie is licensed under a Creative Commons Attribution license (https://creativecommons.org/licenses/...)\n" +
                        "Source: http://chriszabriskie.com/cylinders/\u200B\n" +
                        "Artist: http://chriszabriskie.com/\u200B \n" +
                        "<br/> \n" +
                        "Meditation Impromptu 01 by Kevin MacLeod is licensed under a Creative Commons Attribution license (https://creativecommons.org/licenses/...)\n" +
                        "Source: http://incompetech.com/music/royalty-...\n" +
                        "Artist: http://incompetech.com/\u200B\n" +
                        "<br/> \n" +
                        "\uD83C\uDF3B Những điều mà bạn có thể hỏi mình: \n" +
                        "<br/> \n" +
                        "1. Bạn tên gì? Bao nhiêu tuổi?\n" +
                        "- Mình là Nguyên, bạn cũng có thể gọi mình là Jawon, Mình sinh năm 2004 ^^ \n" +
                        "<br/> \n" +
                        "2. Bạn edit video bằng app gì?\n" +
                        "- Mình edit bằng VLLO, VITA, Inshot, SNOW \n" +
                        "<br/> \n" +
                        "3. Bạn làm thumbnail bằng app gì?\n" +
                        "- Mình làm thumbnail bằng Sketchbook và Phonto \n" +
                        "<br/> \n" +
                        "4. Bạn sử dụng dụng cụ gì để quay?\n" +
                        "- Mình dùng Samsung Galaxy Note10 và Tripod YF-3388 \n" +
                        "<br/> \n" +
                        "5. Vì sao bạn lại tạo ra channel này? \n" +
                        "<br/> \n" +
                        "- Vì mình muốn chia sẻ những kinh nghiệm học tập đồng thời truyền cảm hứng học tập cho mọi người! \n" +
                        "<br/> \n" +
                        "6. Vì sao bạn không lồng tiếng cho video? \n" +
                        "<br/> \n" +
                        "- Vì giọng nói không phải là thế mạnh của mình và trên hết đây là phong cách mình muốn theo đuổi, hiện tại mình vẫn rất hài lòng về nó ^^ \n" +
                        "<br/> \n" +
                        "\uD83C\uDF3B Kết nối với mình nhé: \n" +
                        "<br/> \n" +
                        "Instagram: @jawonee._ \n" +
                        "<br/> \n" +
                        "Facebook: https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbGJ1eU5WMExJRUliemY4VHRZekhXOW1JVWpad3xBQ3Jtc0trcnJfVGh6RUJtUDJ6RzlEM0M1RDQ1T0Nhdk15QWVXX2hEdVFySkNaa0h0bkhGVDh6MnZZSjZQN2RMNktMdWdCNlBRN0FUa183M3d2RWdfSkpmdFRMdjBnWHlwTXZHN1ZOVG5zMmhWSzhmaVEzR0w0aw&q=https%3A%2F%2Fwww.facebook.com%2FJawonee-5760 \n" +
                        "<br/> \n" +
                        "Tiktok: https://vt.tiktok.com/ZSJJxpmbr/",
                1920,
                241,
                "https://i.ytimg.com/vi/pITmw14bvpM/maxresdefault.jpg",
                9,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Cách tự học Tiếng Anh ở nhà vẫn tiến bộ nhanh | VyVocab Ep.44 | Khánh Vy",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gvtKHz7MWpo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                109690,
                Timestamp.valueOf("2020-11-06 18:00:00.00"),
                "#khanhvy #tienganh",
                "Cách học Tiếng Anh nhanh nhất?\n" +
                        "<br/> \n" +
                        "Ui chà chà, cách gì đó ta!?! Nói chứ mình thấy “ If it's important to you, you'll find the way. If not, you'll make excuses - Nếu mà nó thật sự quan trọng với bạn, bạn sẽ tìm cách. Nếu không, bạn sẽ tìm lý do\". Mình hiểu những thời điểm bạn nhận thức được học tiếng Anh là quan trọng nhưng vẫn chưa thể bắt tay thực hiện bền bỉ được. Có thể đó là lúc mục tiêu chưa quá rõ ràng và thật sự quan trọng với bạn. Yên tâm, khi đã có mục tiêu mà mình “sống còn\" cùng nó, thì đào núi lấp bể cũng làm được chứ huống gì là Tiếng Anh nhỉ. \n" +
                        "<br/> \n" +
                        "Về App MochiMochi tiếng Anh\n" +
                        "- Link đăng kí khoá học và được giảm 30%: https://bom.to/vbEJL7\n" +
                        "<br/> \n" +
                        "- Trải nghiệm MochiMochi tại: https://learn.mochidemy.com/\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Nguồn tham khảo:\n" +
                        "Quy tắc 10,000 giờ và 20 giờ:\n" +
                        "https://www.youtube.com/watch?v=5MgBi...\n" +
                        "<br/> \n" +
                        "TIMESPTAMP:\n" +
                        "0:00 - 1:34 - Cách nhanh nhất\n" +
                        "1:35 - 2:28 - Quy tắc 10,000 giờ và 20 giờ\n" +
                        "2:29 - 3:21 - SMART Goals\n" +
                        "3:22 - 4:53 - Mẹo nói Tiếng Anh tây hơn\n" +
                        "4:54 - 5:29 - Chán quá thì học sao?\n" +
                        "5:30 - 8:26 - App học Tiếng Anh \n" +
                        "8:27 - 8:56 - Follow những trang này\n" +
                        "8:57 - 9:39 - Mẹo nói Tiếng Anh mượt hơn\n" +
                        "9:40 - 10:12 - Bí kíp luyện nghe\n" +
                        "<br/> \n" +
                        "✪ Nhấn Đăng kí tại: https://bit.ly/2H6G8cO\n" +
                        "<br/> \n" +
                        "#khanhvy #tienganh\n" +
                        "➥ Follow me: \n" +
                        "» Fanpage: https://www.facebook.com/khanhvyofficial\n" +
                        ".\n" +
                        "» Instagram: https://www.instagram.com/khanhvyccf\n" +
                        "<br/> \n" +
                        "Mail:   contact.khanhvy@gmail.com\n" +
                        "--------------------------/---------------------------------------------------\n" +
                        "© Bản quyền thuộc về Khánh Vy OFFICIAL\n" +
                        "© Copyright by Khanh Vy OFFICIAL ☞ Do not Reup",
                6502,
                40,
                "https://i.ytimg.com/vi/gvtKHz7MWpo/maxresdefault.jpg",
                10,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Cách Nhanh Nhất để Học Tiếng Anh | The fastest way to learn English? VyVocab Ep.88",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gvtKHz7MWpo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1459118,
                Timestamp.valueOf("2020-03-13 18:00:00.00"),
                "",
                "Cách tự học Tiếng Anh ở nhà mà vẫn hiệu quả và tiến bộ nhanh.\n" +
                        "➥ INSTAGRAM VÀ FACEBOOK CỦA MÌNH ĐÂY:\n" +
                        "» Facebook: https://www.facebook.com/khanhvytran218\n" +
                        " \n" +
                        "» Fanpage: https://www.facebook.com/khanhvyofficial\n" +
                        ".\n" +
                        "» Instagram:  @khanhvyccf\n" +
                        "--------------------------/---------------------------------------------------\n" +
                        "© Bản quyền thuộc về Khánh Vy OFFICIAL\n" +
                        "© Copyright by Khanh Vy OFFICIAL ☞ Do not Reup",
                72863,
                571,
                "https://i.ytimg.com/vi/x8I_Z3-jGhk/maxresdefault.jpg",
                10,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Mất gốc Tiếng Anh, tự học thế nào để giỏi lên? | VyVocab Ep.47 | Khánh Vy",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gvtKHz7MWpo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                2200221,
                Timestamp.valueOf("2020-04-11 18:00:00.00"),
                "#onhacoShopee",
                "Ở nhà mùa này thật hợp lý để tận dụng học và ôn tiếng anh đó. \n" +
                        "Nếu các bạn cần dụng cụ học tập hay sách vở để học thì cứ lên Shopee nha, vừa có Flash Sale 3 khung giờ, giá bình ổn mà còn freeship từ nay đến 24.04. Đặc biệt ngày 15 và 24 là 2 ngày sale lớn đó: https://bit.ly/2UZ1GgN\n" +
                        "#onhacoShopee\n" +
                        "Cảm ơn Shopee đã đồng hành cùng Vy trong tập này.\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "✪ Nhấn Đăng kí tại: https://bit.ly/2H6G8cO\n" +
                        "➥ FACEBOOK VÀ INSTAGRAM CỦA TỚ\"<br/> \n" +
                        "» Facebook: https://www.facebook.com/khanhvytran218 \n" +
                        "» Fanpage: https://www.facebook.com/khanhvyofficial.\n" +
                        "» IG: @khanhvyccf\n" +
                        "--------------------------/---------------------------------------------------\n" +
                        "© Bản quyền thuộc về Khánh Vy OFFICIAL\n" +
                        "© Copyright by Khanh Vy OFFICIAL ☞ Do not Reup",
                106281,
                977,
                "https://i.ytimg.com/vi/1FdCazTGE2w/maxresdefault.jpg",
                10,
                6,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: education*/

        /* begin: technology*/
        videos.add(new Video(
                "Những Thiết Bị Công Nghệ Sẽ Khiến Bạn Phát Cuồng - 7 Ngày Công Nghệ",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/vAmNuhRMBvs?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                25904,
                Timestamp.valueOf("2021-04-26 20:00:00.00"),
                "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin",
                "Nơi giới thiệu những công nghệ đỉnh cao mới nhất\n" +
                        "\uD83D\uDD14 Theo dõi kênh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA Tổng hợp PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thiết Bị Thông Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Những Công Nghệ Vũ Trang Tân Tiến Nhất: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Phương Tiện Đi lại Thời Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C Nếu bạn yêu thích video, đừng quên đăng ký và nhấn vào nút \uD83D\uDD14 để cập nhật những video mới nhất của kênh nha!!!\n" +
                        "❤️❤️❤️ Cảm ơn bạn đã xem video và quan tâm kênh ❤️❤️❤️" +
                        "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin\n" +
                        "#côngnghệmới\n",
                0,
                0,
                "https://i.ytimg.com/vi/vAmNuhRMBvs/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLD-IuGvTZ7gEXF0yC6JeL4etyobUA",
                11,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "10 Thiết Bị Thông Minh Giúp Cải Thiện Của Sống Của Bạn #7 - 7 Ngày Công Nghệ",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/HxyiRFqo6Y0?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                6458,
                Timestamp.valueOf("2021-04-26 20:00:00.00"),
                "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin",
                "Nơi giới thiệu những công nghệ đỉnh cao mới nhất\n" +
                        "\uD83D\uDD14 Theo dõi kênh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA Tổng hợp PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thiết Bị Thông Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Những Công Nghệ Vũ Trang Tân Tiến Nhất: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Phương Tiện Đi lại Thời Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C Nếu bạn yêu thích video, đừng quên đăng ký và nhấn vào nút \uD83D\uDD14 để cập nhật những video mới nhất của kênh nha!!!\n" +
                        "❤️❤️❤️ Cảm ơn bạn đã xem video và quan tâm kênh ❤️❤️❤️" +
                        "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin\n" +
                        "#côngnghệmới\n",
                0,
                0,
                "https://i.ytimg.com/vi/HxyiRFqo6Y0/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCSe0UCtJ9iFHo0V4cj087u2spXoQ",
                11,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Top 5 phát minh khoa học trong phim viễn tưởng có thật",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/HxyiRFqo6Y0?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                10898,
                Timestamp.valueOf("2021-11-27 20:00:00.00"),
                "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin",
                "Nơi giới thiệu những công nghệ đỉnh cao mới nhất\n" +
                        "\uD83D\uDD14 Theo dõi kênh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA Tổng hợp PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thiết Bị Thông Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Những Công Nghệ Vũ Trang Tân Tiến Nhất: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Phương Tiện Đi lại Thời Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C Nếu bạn yêu thích video, đừng quên đăng ký và nhấn vào nút \uD83D\uDD14 để cập nhật những video mới nhất của kênh nha!!!\n" +
                        "❤️❤️❤️ Cảm ơn bạn đã xem video và quan tâm kênh ❤️❤️❤️" +
                        "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin\n" +
                        "#côngnghệmới\n",
                0,
                0,
                "https://i.ytimg.com/vi/XXbn-MPPiNU/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBcelYzB4u6VLl0EsUV0mylzYEOAQ",
                11,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Điểm mặt những sản phẩm công nghệ ấn tượng nhất tại sự kiện CES 2021 | 7NCN",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/tHFCrprT6rY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                9111,
                Timestamp.valueOf("2021-01-27 20:00:00.00"),
                "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin",
                "Triễn lãm điện tử tiêu dùng toàn cầu CES ( Consumer Electronic Show ): là một trong những sự kiện lớn nhất của làng công nghệ thế giới\n" +
                        "Nơi giới thiệu những công nghệ đỉnh cao mới nhất\n" +
                        "\uD83D\uDD14 Theo dõi kênh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA Tổng hợp PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thiết Bị Thông Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Những Công Nghệ Vũ Trang Tân Tiến Nhất: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Phương Tiện Đi lại Thời Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C Nếu bạn yêu thích video, đừng quên đăng ký và nhấn vào nút \uD83D\uDD14 để cập nhật những video mới nhất của kênh nha!!!\n" +
                        "❤️❤️❤️ Cảm ơn bạn đã xem video và quan tâm kênh ❤️❤️❤️" +
                        "#7ngaycongnghe #côngnghệtươnglai #côngnghệthôngtin\n" +
                        "#côngnghệmới\n",
                0,
                0,
                "https://i.ytimg.com/vi/tHFCrprT6rY/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBNFh0j57eog9kpdp8tFcAN6T1F4Q",
                11,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Google Makes Own Chips for New Pixel Phones",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/bGqT5sXHM7w?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                23660,
                Timestamp.valueOf("2021-08-03 20:00:00.00"),
                "",
                "Aug.02 -- Google is making a bigger bet on smartphones by joining rivals Apple Inc. and Samsung Electronics Co. in designing the device’s most critical component in-house: the main processor. Mark Gurman reports on Power On\n",
                0,
                0,
                "https://i.ytimg.com/vi/bGqT5sXHM7w/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLA2ZtBv_kIDCbBpWUdyay8cCpDgQg",
                12,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Amazon Unveils $1,000 Robot for the Home",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/QsVCqTmvt3Y?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                25693,
                Timestamp.valueOf("2021-09-29 20:00:00.00"),
                "",
                "Amazon unveils a range of new products for the home. Among them is a $1,000 robot called \"Astro.\" Emily Chang talks to Dave Limp, Amazon senior vice president of devices and services. (Source: Bloomberg)\n",
                0,
                0,
                "https://i.ytimg.com/vi/QsVCqTmvt3Y/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLBrkrvXB8HaHSSm1Bi_8xMPvvrLRw",
                12,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "BREAKTHROUGH: Scientists Reverse Blindness [CRISPR Technology]",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/rbVvu_104Pg?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                343407,
                Timestamp.valueOf("2021-11-08 20:00:00.00"),
                "",
                "CRISPR Gene editing therapy is used for the first time in living humans with amazing results.\n" +
                        "<br/> \n" +
                        "0:00 Introduction \n" +
                        "0:53 What is CRISPR?\n" +
                        "2:05 How Does CRISPR work?\n" +
                        "3:18 The Experiment\n" +
                        "5:30 The Results\n" +
                        "9:31 Shortcomings\n" +
                        "10:34 The Future\n" +
                        "12:00 Caution\n" +
                        "13:02 Conclusions\n" +
                        "<br/> \n" +
                        "--- About ColdFusion ---\n" +
                        "ColdFusion is an Australian based online media company independently run by Dagogo Altraide since 2009. Topics cover anything in science, technology, history and business in a calm and relaxed environment. \n" +
                        "<br/> \n" +
                        "ColdFusion Discord:  https://discord.gg/coldfusion\n" +
                        "<br/> \n" +
                        "Podcast: https://open.spotify.com/show/3dj6YGj...\n" +
                        "<br/> \n" +
                        "ColdFusion Music Channel: https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "ColdFusion Merch:\n" +
                        "INTERNATIONAL: https://store.coldfusioncollective.com/\n" +
                        "AUSTRALIA: https://shop.coldfusioncollective.com/\n" +
                        "<br/> \n" +
                        "If you enjoy my content, please consider subscribing!\n" +
                        "I'm also on Patreon: https://www.patreon.com/ColdFusion_TV\n" +
                        "Bitcoin address: 13SjyCXPB9o3iN4LitYQ2wYKeqYTShPub8\n" +
                        "<br/> \n" +
                        "--- \"New Thinking\" written by Dagogo Altraide ---\n" +
                        "This book was rated the 9th best technology history book by book authority.\n" +
                        "In the book you’ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "» Twitter | @ColdFusion_TV\n" +
                        "» Instagram | coldfusiontv\n" +
                        "» Facebook | https://www.facebook.com/ColdFusionTV\n" +
                        "<br/> \n" +
                        "Sources:\n" +
                        "<br/> \n" +
                        "https://theconversation.com/what-is-c...\n" +
                        "<br/> \n" +
                        "https://www.newscientist.com/definiti...\n" +
                        "<br/> \n" +
                        "Research paper: https://journals.lww.com/retinajourna...\n" +
                        "<br/> \n" +
                        "https://futurism.com/neoscope/gene-th...\n" +
                        "<br/> \n" +
                        "https://www.vox.com/2018/7/23/1759486...\n" +
                        "<br/> \n" +
                        "https://www.npr.org/sections/health-s...\n" +
                        "<br/> \n" +
                        "My Music Channel:  https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "//Soundtrack//\n" +
                        "<br/> \n" +
                        "Burn Water - Nostalgia Dreams\n" +
                        "<br/> \n" +
                        "Luis Miehlich - I Tried To Reach Out (with Handbook of Magic)\n" +
                        "<br/> \n" +
                        "Hiatus - As Close To Me As You Are Now\n" +
                        "<br/> \n" +
                        "Roald Velden - Peaceful\n" +
                        "<br/> \n" +
                        "Gem Club - First Weeks\n" +
                        "<br/> \n" +
                        "Sleepyfish - Forgot It Was Monday \n" +
                        "<br/> \n" +
                        "Nova Nova - See\n" +
                        "<br/> \n" +
                        "Burn Water - Youth \n" +
                        "<br/> \n" +
                        "» Music I produce | http://burnwater.bandcamp.com or \n" +
                        "» http://www.soundcloud.com/burnwater\n" +
                        "» https://www.patreon.com/ColdFusion_TV\n" +
                        "» Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
                        "<br/> \n" +
                        "Producer: Dagogo Altraide\n",
                0,
                0,
                "https://i.ytimg.com/vi/rbVvu_104Pg/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCOV_9qBteBUiFSwYf2fnGS5rQJqQ",
                13,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "A Deep Look at AI Generated Music",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/EyeW_axUEQU?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                200346,
                Timestamp.valueOf("2021-09-22 20:00:00.00"),
                "",
                "Go to https://www.Brilliant.org/coldfusion to receive 20% off!\n" +
                        "Previous AI Episode: https://youtu.be/KZ7BnJb30Cc" +
                        "<br/> \n" +
                        "--- About ColdFusion ---\n" +
                        "ColdFusion is an Australian based online media company independently run by Dagogo Altraide since 2009. Topics cover anything in science, technology, history and business in a calm and relaxed environment. \n" +
                        "<br/> \n" +
                        "ColdFusion Discord:  https://discord.gg/coldfusion\n" +
                        "<br/> \n" +
                        "Podcast: https://open.spotify.com/show/3dj6YGj...\n" +
                        "<br/> \n" +
                        "ColdFusion Music Channel: https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "ColdFusion Merch:\n" +
                        "INTERNATIONAL: https://store.coldfusioncollective.com/\n" +
                        "AUSTRALIA: https://shop.coldfusioncollective.com/\n" +
                        "<br/> \n" +
                        "If you enjoy my content, please consider subscribing!\n" +
                        "I'm also on Patreon: https://www.patreon.com/ColdFusion_TV\n" +
                        "Bitcoin address: 13SjyCXPB9o3iN4LitYQ2wYKeqYTShPub8\n" +
                        "<br/> \n" +
                        "--- \"New Thinking\" written by Dagogo Altraide ---\n" +
                        "This book was rated the 9th best technology history book by book authority.\n" +
                        "In the book you’ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "» Twitter | @ColdFusion_TV\n" +
                        "» Instagram | coldfusiontv\n" +
                        "» Facebook | https://www.facebook.com/ColdFusionTV\n" +
                        "<br/> \n" +
                        "Sources:\n" +
                        "<br/> \n" +
                        "https://theconversation.com/what-is-c...\n" +
                        "<br/> \n" +
                        "https://www.newscientist.com/definiti...\n" +
                        "<br/> \n" +
                        "Research paper: https://journals.lww.com/retinajourna...\n" +
                        "<br/> \n" +
                        "https://futurism.com/neoscope/gene-th...\n" +
                        "<br/> \n" +
                        "https://www.vox.com/2018/7/23/1759486...\n" +
                        "<br/> \n" +
                        "https://www.npr.org/sections/health-s...\n" +
                        "<br/> \n" +
                        "My Music Channel:  https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "//Soundtrack//\n" +
                        "<br/> \n" +
                        "Burn Water - Nostalgia Dreams\n" +
                        "<br/> \n" +
                        "Luis Miehlich - I Tried To Reach Out (with Handbook of Magic)\n" +
                        "<br/> \n" +
                        "Hiatus - As Close To Me As You Are Now\n" +
                        "<br/> \n" +
                        "Roald Velden - Peaceful\n" +
                        "<br/> \n" +
                        "Gem Club - First Weeks\n" +
                        "<br/> \n" +
                        "Sleepyfish - Forgot It Was Monday \n" +
                        "<br/> \n" +
                        "Nova Nova - See\n" +
                        "<br/> \n" +
                        "Burn Water - Youth \n" +
                        "<br/> \n" +
                        "» Music I produce | http://burnwater.bandcamp.com or \n" +
                        "» http://www.soundcloud.com/burnwater\n" +
                        "» https://www.patreon.com/ColdFusion_TV\n" +
                        "» Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
                        "<br/> \n" +
                        "Producer: Dagogo Altraide\n",
                0,
                0,
                "https://i.ytimg.com/vi/EyeW_axUEQU/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLDxiOvVb7X3yVQ1MnGVZArdaA6loQ",
                13,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Companies Losing 100s of Billions - Global Chip Shortage",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/AeN3oQx-o68?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                696901,
                Timestamp.valueOf("2021-06-10 20:00:00.00"),
                "",
                "ColdFusion Discord:  https://discord.gg/coldfusion\n" +
                        "<br/> \n" +
                        "ColdFusion Music Channel: https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "--- About ColdFusion ---\n" +
                        "ColdFusion is an Australian based online media company independently run by Dagogo Altraide since 2009. Topics cover anything in science, technology, history and business in a calm and relaxed environment. \n" +
                        "<br/> \n" +
                        "ColdFusion Discord:  https://discord.gg/coldfusion\n" +
                        "<br/> \n" +
                        "Podcast: https://open.spotify.com/show/3dj6YGj...\n" +
                        "<br/> \n" +
                        "ColdFusion Music Channel: https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "ColdFusion Merch:\n" +
                        "INTERNATIONAL: https://store.coldfusioncollective.com/\n" +
                        "AUSTRALIA: https://shop.coldfusioncollective.com/\n" +
                        "<br/> \n" +
                        "If you enjoy my content, please consider subscribing!\n" +
                        "I'm also on Patreon: https://www.patreon.com/ColdFusion_TV\n" +
                        "Bitcoin address: 13SjyCXPB9o3iN4LitYQ2wYKeqYTShPub8\n" +
                        "<br/> \n" +
                        "--- \"New Thinking\" written by Dagogo Altraide ---\n" +
                        "This book was rated the 9th best technology history book by book authority.\n" +
                        "In the book you’ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "» Twitter | @ColdFusion_TV\n" +
                        "» Instagram | coldfusiontv\n" +
                        "» Facebook | https://www.facebook.com/ColdFusionTV\n" +
                        "<br/> \n" +
                        "Sources:\n" +
                        "<br/> \n" +
                        "https://theconversation.com/what-is-c...\n" +
                        "<br/> \n" +
                        "https://www.newscientist.com/definiti...\n" +
                        "<br/> \n" +
                        "Research paper: https://journals.lww.com/retinajourna...\n" +
                        "<br/> \n" +
                        "https://futurism.com/neoscope/gene-th...\n" +
                        "<br/> \n" +
                        "https://www.vox.com/2018/7/23/1759486...\n" +
                        "<br/> \n" +
                        "https://www.npr.org/sections/health-s...\n" +
                        "<br/> \n" +
                        "My Music Channel:  https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "//Soundtrack//\n" +
                        "<br/> \n" +
                        "Burn Water - Nostalgia Dreams\n" +
                        "<br/> \n" +
                        "Luis Miehlich - I Tried To Reach Out (with Handbook of Magic)\n" +
                        "<br/> \n" +
                        "Hiatus - As Close To Me As You Are Now\n" +
                        "<br/> \n" +
                        "Roald Velden - Peaceful\n" +
                        "<br/> \n" +
                        "Gem Club - First Weeks\n" +
                        "<br/> \n" +
                        "Sleepyfish - Forgot It Was Monday \n" +
                        "<br/> \n" +
                        "Nova Nova - See\n" +
                        "<br/> \n" +
                        "Burn Water - Youth \n" +
                        "<br/> \n" +
                        "» Music I produce | http://burnwater.bandcamp.com or \n" +
                        "» http://www.soundcloud.com/burnwater\n" +
                        "» https://www.patreon.com/ColdFusion_TV\n" +
                        "» Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
                        "<br/> \n" +
                        "Producer: Dagogo Altraide\n",
                0,
                0,
                "https://i.ytimg.com/vi/AeN3oQx-o68/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLApkxRxHwehEZhwri_7Hnmx5WKVGw",
                13,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "The Great Google Crash: The World’s Dependency Revealed",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/vJ1cfb-5pHQ?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1100446,
                Timestamp.valueOf("2020-12-22 20:00:00.00"),
                "",
                "Become smarter in 5 minutes by signing up for free today: https://cen.yt/mbcoldfusion4  - Thanks to Morning Brew for sponsoring today’s video.\n" +
                        "<br/> \n" +
                        "--- About ColdFusion ---\n" +
                        "ColdFusion is an Australian based online media company independently run by Dagogo Altraide since 2009. Topics cover anything in science, technology, history and business in a calm and relaxed environment. \n" +
                        "<br/> \n" +
                        "ColdFusion Discord:  https://discord.gg/coldfusion\n" +
                        "<br/> \n" +
                        "Podcast: https://open.spotify.com/show/3dj6YGj...\n" +
                        "<br/> \n" +
                        "ColdFusion Music Channel: https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "ColdFusion Merch:\n" +
                        "INTERNATIONAL: https://store.coldfusioncollective.com/\n" +
                        "AUSTRALIA: https://shop.coldfusioncollective.com/\n" +
                        "<br/> \n" +
                        "If you enjoy my content, please consider subscribing!\n" +
                        "I'm also on Patreon: https://www.patreon.com/ColdFusion_TV\n" +
                        "Bitcoin address: 13SjyCXPB9o3iN4LitYQ2wYKeqYTShPub8\n" +
                        "<br/> \n" +
                        "--- \"New Thinking\" written by Dagogo Altraide ---\n" +
                        "This book was rated the 9th best technology history book by book authority.\n" +
                        "In the book you’ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "» Twitter | @ColdFusion_TV\n" +
                        "» Instagram | coldfusiontv\n" +
                        "» Facebook | https://www.facebook.com/ColdFusionTV\n" +
                        "<br/> \n" +
                        "Sources:\n" +
                        "<br/> \n" +
                        "https://theconversation.com/what-is-c...\n" +
                        "<br/> \n" +
                        "https://www.newscientist.com/definiti...\n" +
                        "<br/> \n" +
                        "Research paper: https://journals.lww.com/retinajourna...\n" +
                        "<br/> \n" +
                        "https://futurism.com/neoscope/gene-th...\n" +
                        "<br/> \n" +
                        "https://www.vox.com/2018/7/23/1759486...\n" +
                        "<br/> \n" +
                        "https://www.npr.org/sections/health-s...\n" +
                        "<br/> \n" +
                        "My Music Channel:  https://www.youtube.com/channel/UCGkp...\n" +
                        "<br/> \n" +
                        "//Soundtrack//\n" +
                        "<br/> \n" +
                        "Burn Water - Nostalgia Dreams\n" +
                        "<br/> \n" +
                        "Luis Miehlich - I Tried To Reach Out (with Handbook of Magic)\n" +
                        "<br/> \n" +
                        "Hiatus - As Close To Me As You Are Now\n" +
                        "<br/> \n" +
                        "Roald Velden - Peaceful\n" +
                        "<br/> \n" +
                        "Gem Club - First Weeks\n" +
                        "<br/> \n" +
                        "Sleepyfish - Forgot It Was Monday \n" +
                        "<br/> \n" +
                        "Nova Nova - See\n" +
                        "<br/> \n" +
                        "Burn Water - Youth \n" +
                        "<br/> \n" +
                        "» Music I produce | http://burnwater.bandcamp.com or \n" +
                        "» http://www.soundcloud.com/burnwater\n" +
                        "» https://www.patreon.com/ColdFusion_TV\n" +
                        "» Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
                        "<br/> \n" +
                        "Producer: Dagogo Altraide\n",
                0,
                0,
                "https://i.ytimg.com/vi/vJ1cfb-5pHQ/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLD-5CJi29WFGmUIAAwDHILZ8vLqgw",
                13,
                7,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: technology*/

        /* begin: life */
        videos.add(new Video(
                "Living with the Dark Winters in Sweden | Midnight sun & Polar night",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/3zTR4ayDG38?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                12758413,
                Timestamp.valueOf("2020-01-13 20:00:00.00"),
                "",
                "Dark winters with no sunlight for many weeks, and bright summers with sunlight 24 hours/day. How is it to live with the extreme light conditions that countries in the Northern hemisphere have? \n" +
                        "In this video I want to share my own personal experience and perspective of living with the seasons in the North of Sweden, and take you on a journey to the darkest and brightest times of the year, and share the beauty and the challenges that comes with them. \n" +
                        "<br/> \n" +
                        "I hope you will enjoy it! Thank you so much for watching! ♥\n" +
                        "<br/> \n" +
                        "► MY SOCIAL MEDIA AND LINKS!\n" +
                        "• My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "• Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "• Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "• Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "• Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "► MUSIC\n" +
                        "You can find most of the songs I use here:\n" +
                        "http://share.epidemicsound.com/pR9G6 (affiliate link)\n" +
                        "Break - Roary (Musicbed)\n" +
                        "Daydream in A for piano - Eric Kinny (Musicbed)\n" +
                        "Daydream in D for cello - Eric Kinny\n" +
                        "Cause - Infinite Ripple\n" +
                        "Through the storm - Savvun\n" +
                        "Memories of Sardinia - Franz Gordon\n" +
                        "Oasis - Yi Nantiro\n" +
                        "The Goths - Bonnie Grace\n" +
                        "<br/> \n" +
                        "MB01WYFTHEO2U07\n",
                0,
                0,
                "https://i.ytimg.com/vi/3zTR4ayDG38/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDt2o2TNk1PvZE7FB-hdFEY70lBdg",
                14,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Building my CamperVan + Life, love and loss",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/B4uPNvLLRNY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1111178,
                Timestamp.valueOf("2020-06-25 20:00:00.00"),
                "",
                "I am so excited to finally show you what I've been working on for the last month, and to also give you a little overall life update with all its ups and downs. My campervan is finally finished and it became the van of my dreams! I can't wait to go on my first roadtrip now. \n" +
                        "<br/> \n" +
                        "Now it's June and the time of midsummer here in Sweden. The days are endless. The nights are bright as a cloudy day and this is my favorite time of the year. So much flowing energy in nature. It's magical. I look forward to share more of the beautiful Swedish summer in the next video. \n" +
                        "<br/> \n" +
                        "I hope you enjoyed watching this! Thank you for being here.\n" +
                        "You make the world a more beautiful place ♥\n" +
                        "<br/> \n" +
                        "Sending you all LOTS of love! \n" +
                        "<br/> \n" +
                        "► MY SOCIAL MEDIA AND LINKS!\n" +
                        "• My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "• Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "• Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "• Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "• Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "► MUSIC\n" +
                        "You can find some of the songs here: \n" +
                        "http://share.epidemicsound.com/pR9G6\u200B (affiliate link)\n" +
                        "Allude - Madron\n" +
                        "Skjonnhet reprise - Judah Earl\n" +
                        "Calm heart wild river - Sad Moses\n" +
                        "Nostalguiqe - Martin Hall\n" +
                        "Urban Farm - Gary the Canary\n" +
                        "Woman like you - Peter Crosby\n" +
                        "Avenoir - Katharine Petkovski\n" +
                        "Light in your hand - Sad Moses\n" +
                        "Time without end - Spectacles wallet and watch\n" +
                        "<br/> \n" +
                        "MB01GJ3MTHGRRSD\n",
                0,
                0,
                "https://i.ytimg.com/vi/B4uPNvLLRNY/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLC6X5ueFxvdoW0VKSUm3Q0jRuJVgA",
                14,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Where I've been",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/WYGuRANhitA?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                860991,
                Timestamp.valueOf("2020-09-24 20:00:00.00"),
                "",
                "Hello my loves! \n" +
                        "Summer has ended here in the North and I wanted to share with you what I've been up to since my last video. My first trip in the van, a magical week in the medieval time, a new family member and just lots of small projects here and there. I hope you will enjoy it! :)\n" +
                        "<br/> \n" +
                        "Thank you so much for watching my video! ♥ And thank you for all your comments!! \n" +
                        "Wish I could answer you all to let you know how grateful I am.\n" +
                        "Sending SO much love to all of you! Take care! \n" +
                        "<br/> \n" +
                        "► MY SOCIAL MEDIA AND LINKS!\n" +
                        "• My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "• Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "• Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "• Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "• Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "► MUSIC\n" +
                        "You can find most of the songs here:\n" +
                        "http://share.epidemicsound.com/pR9G6\u200B (affiliate link)\n" +
                        "The Bard's Tale - Christoffer Moe Ditlevsen\n" +
                        "For the Weary - Bonnie Grace\n" +
                        "Free Form - Amaranth\n" +
                        "Logistics - Bytheway May\n" +
                        "Across the aisle - Madron\n" +
                        "Mountain Air - Cody Francis\n" +
                        "Light in your hand - Sad Moses\n" +
                        "Deeper - Chris Coleman\n" +
                        "Through the Storm - Savvun\n" +
                        "Ack Varmenland, du Skona - Traditional\n" +
                        "Time without end - Spectacles wallet and watch\n" +
                        "<br/> \n" +
                        "MB01FRGNZCDM37G\n",
                0,
                0,
                "https://i.ytimg.com/vi/WYGuRANhitA/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLDE_SnBGKb6GmvDkRNhLONJs6LFfQ",
                14,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "A time of change",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/g7ev29b9sqM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                120769,
                Timestamp.valueOf("2020-04-30 20:00:00.00"),
                "",
                "So this is my past two months wrapped up into 20 minutes, with all it's messy, hard and beautiful moments. There is so much going on in my life right now, both on the surface and inside, which I know a lot of you can relate to. But I am very glad to finally have time again for creating videos. I've missed you! \n" +
                        "I hope this little video can bring a smile on your beautiful face, or maybe just a moment to relax or enjoy some highlights from my life the past weeks. Hope you'll like it! \n" +
                        "<br/> \n" +
                        "Sending you tons of love! ♥\n" +
                        "(AND THANK YOU FOR 3 MILLION SUBS!!!)\n" +
                        "<br/> \n" +
                        "►  Marie's channel: https://www.youtube.com/user/Emlouxo\n" +
                        "►  Ash's channel: https://www.youtube.com/user/MadForBi...\n" +
                        "►  Adrian's channel: https://www.youtube.com/channel/UCKst...\n" +
                        "<br/> \n" +
                        "► Jonas video from our adventure in in mountains: https://www.youtube.com/watch?v=Bhc9u...\n" +
                        "<br/> \n" +
                        "► MY SOCIAL MEDIA AND LINKS\n" +
                        "• My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "• Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "• Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "• Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "• Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "► MUSIC\n" +
                        "You can find some of the songs here: \n" +
                        "http://share.epidemicsound.com/pR9G6\u200B (affiliate link)\n" +
                        "Tenderness - Tony Andersson (Musicbed)\n" +
                        "Yearn - Chris Coleman (Musicbed)\n" +
                        "Drifting - Nick Box (Musicbed)\n" +
                        "Mountain Spring High - Gabriel Lewis\n" +
                        "Patchwork Heart - Justin Wade (Musicbed)\n" +
                        "Taking me high taking me low - Johan Glossner \n" +
                        "Unfold - Steven Gutheinz (Musicbed)\n" +
                        "Running Circles - Cody Francis\n" +
                        "My Old Man - Lindsey Abraham\n" +
                        "Light in your hand - Sad Moses (Musicbed)\n" +
                        "Time without end - Spectacles wallet and watch\n" +
                        "<br/> \n" +
                        "MB01LMQKLRUUH4Y\n",
                0,
                0,
                "https://i.ytimg.com/vi/g7ev29b9sqM/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLB8UJY7t3qdDYbBMw79-1S4mC1eBg",
                14,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Summer in the North | My days of July",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/xmRbkgikEVE?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1252600,
                Timestamp.valueOf("2020-07-26 20:00:00.00"),
                "",
                "Summer is here and that means a lot of things going on and energy flowing from all directions. I've had a beautiful summer so far and in this video I hope to take you with me into my world for a little while and share what I've been up to in July. \n" +
                        "A Shaman retreat, herding cows, picking berries, fighting mosquitos, working and much more! \n" +
                        "<br/> \n" +
                        "How are your summer so far? I hope you are all well and taking care of yourselves. \n" +
                        "Thank you so much for watching this and being here ! Sending you tons of love! ♥\n" +
                        "<br/> \n" +
                        "► MY SOCIAL MEDIA AND LINKS\n" +
                        "• My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "• Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "• Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "• Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "• Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "► MUSIC\n" +
                        "You can find some of the songs here: \n" +
                        "http://share.epidemicsound.com/pR9G6\u200B (affiliate link)\n" +
                        "Peace in the realm - Bonnie Grace\n" +
                        "Safe - Adrian Disch\n" +
                        "Logistics - Bytheway May\n" +
                        "What is lost - Dexter Britain\n" +
                        "First Love - Jonathan David Melissa Helser\n" +
                        "A woman like you - Peter Crosby\n" +
                        "Call the herd - Bonnie Grace\n" +
                        "Light in your hand - Sad Moses\n" +
                        "After the storm - Above the clouds\n" +
                        "Through the storm - Savvun\n" +
                        "Never stop - Tyler Brown Williams\n" +
                        "Lum with lane king - Chris Coleman\n" +
                        "Patchwork heart - Justin Wade Tam\n" +
                        "Time without end - Spectacles wallet and watch\n" +
                        "<br/> \n" +
                        "MB01OKXLHSGPXPI\n",
                0,
                0,
                "https://i.ytimg.com/vi/xmRbkgikEVE/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLC-yxEPFQGgBwYk3EKJSPWguHsj_A",
                14,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "Vẻ đẹp của một cuộc sống bình thường - mạng xã hội và cuộc sống giản dị",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/7H3D-6nj_dY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1562657,
                Timestamp.valueOf("2020-06-17 20:00:00.00"),
                "",
                "Hôm nay tôi muốn chia sẻ một số kinh nghiệm và cảm nhận của mình về mạng xã hội, cũng như những lợi ích và thách thức liên quan đến nó.\n" +
                        "Tôi cũng muốn chia sẻ lý do tại sao tôi chỉ chia sẻ một số khía cạnh của cuộc sống và sự riêng tư quan trọng như thế nào đối với tôi, đặc biệt là đối với các mối quan hệ của tôi. Kênh này sẽ luôn là thiên đường nghệ thuật của ánh sáng và hòa bình, được nhìn qua lăng kính sáng tạo nhằm làm nổi bật vẻ đẹp như tranh vẽ của đời thường và hàng ngày.\n" +
                        "Tên tôi là Paola, tôi là người Mỹ gốc Puerto Rico, 24 tuổi và hiện đang tự kinh doanh tại Bang Washington. Cảm ơn bạn vì tất cả những bình luận đáng yêu của bạn, nó được đánh giá cao ❤️\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8A\uD83C\uDF44My Etsy Shop: https://www.etsy.com/shop/thecottagef...\n" +
                        "<br/> \n" +
                        "❤️ Không có nghĩa vụ gì, nhưng nếu bạn muốn đóng góp để ủng hộ kênh này. $ 5 sẽ nhận được một tấm bưu thiếp cảm ơn (nghệ thuật của riêng tôi) từ tôi trong thư (bạn phải ghi địa chỉ trong ghi chú của mình để tôi có thể gửi nó!). Nó được đánh giá cao: https://www.paypal.com/donate?hosted_...\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8BInstagram: https://www.instagram.com/the_cottage...\n" +
                        "<br/> \n" +
                        "\uD83C\uDF0C Video này được thực hiện với anh trai của tôi! Anh ấy có một kênh bây giờ! https://linktr.ee/rohan_merrill\n" +
                        "<br/> \n" +
                        "Nguồn cảm hứng công thức (Tôi đã làm bánh nướng xốp thay vì bánh nướng nhỏ, nhưng tôi cá rằng bánh nướng nhỏ thậm chí còn ngon hơn): https://www.acozykitchen.com/chamomil...\n" +
                        "<br/> \n" +
                        "Cánh hoa hồng có kẹo: https://leitesculinaria.com/104920/re...\n" +
                        "<br/> \n" +
                        "2 cuốn sách yêu thích của tôi về thảo mộc, thực phẩm hoang dã và kiếm ăn (tôi đã học được rất nhiều điều từ những cuốn sách này! Chúng rất dễ hiểu, được chụp ảnh và viết đẹp mắt):\n" +
                        "<br/> \n" +
                        "    1. Wild Remedies của Rosalee de la Foret\n" +
                        "Hiệu sách: shorturl.at/akAHO\n" +
                        "Amazon: https://amzn.to/35rGZzH \n" +
                        "    2. Alchemy of Herbs của Rosalee de la Foret\n" +
                        "Hiệu sách: shorturl.at/eIKSU\n" +
                        "Amazon: https://amzn.to/2JRuXaa\n" +
                        "    3. Cuốn sách yêu thích của tôi về pha trà: https://amzn.to/3cJQWud\n" +
                        "<br/> \n" +
                        "Một số trong nhiều cuốn sách yêu thích:\n" +
                        "<br/> \n" +
                        "1. \"Cậu bé, chuột chũi, cáo và ngựa\" của Charlie Mackesy: https://amzn.to/348of6g\n" +
                        "2. Once Upon a River của Diane Setterfield:\n" +
                        "https://amzn.to/3kp1a5e\n" +
                        "3. Đứa trẻ tuyết của Eowyn Ivey\n" +
                        "Amazon: https://amzn.to/32B2ITM\n" +
                        "<br/> \n" +
                        "Giấy phép Artlist cụ thể\n" +
                        "Số giấy phép - 578124 Chủ sở hữu giấy phép - Rohan B. Merrill\n" +
                        "<br/> \n" +
                        "Nhạc bổ sung được tìm thấy tại @\n" +
                        "https://www.epidemicsound.com/referra...\n" +
                        "(Nhận miễn phí một tháng với mã giới thiệu của tôi)\n" +
                        "<br/> \n" +
                        "Một số liên kết ở trên có thể là liên kết, nghĩa là tôi nhận được một khoản hoa hồng nhỏ\n",
                0,
                0,
                "https://i.ytimg.com/vi/7H3D-6nj_dY/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBhMZdF-dGuZ57ttzLZpcqfNsaXww",
                15,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "The Cost of Rural Cottage Life - being honest with myself, looking for a ‘quick fix’",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/OHucv0YV9c4?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                189165,
                Timestamp.valueOf("2020-10-28 20:00:00.00"),
                "",
                "The Cost of Rural Cottage Life - being honest with myself, looking for a ‘quick fix’\n" +
                        "<br/> \n" +
                        "More details below⬇️ \n" +
                        "<br/> \n" +
                        "\uD83E\uDDF9Broom DIY: https://www.motherearthnews.com/diy/t...\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8A\uD83C\uDF44My Etsy Shop: https://www.etsy.com/shop/thecottagef... (I am closing in late November for the rest of 2021! Thank you\uD83D\uDE0A )\n" +
                        "<br/> \n" +
                        "❤️No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...\n" +
                        "NOTE: now and then a postcard has been returned to me or lost in the mail. If you have not received a postcard e-mail me at endymionmerrill@gmail.com! I send them out each month! Thank you!\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8BInstagram: https://www.instagram.com/the_cottage...\n" +
                        "<br/> \n" +
                        "Link to video I mentioned: https://youtu.be/3Wd70GBa62c\n" +
                        "<br/> \n" +
                        "\uD83C\uDF0C This video was made with my brother! He has a channel now! https://linktr.ee/rohan_merrill\n" +
                        "<br/> \n" +
                        "Information and conservation efforts in the beautiful Okanogan County: https://methowconservancy.org\n" +
                        "\uD83C\uDF0E Take action to protect our lands (no donations necessary): https://www.audubon.org/takeaction\n" +
                        "\uD83C\uDF19 My favorite charity: https://www.nrdc.org \n" +
                        "☀️Take Action: https://www.sierraclub.org/take-action\n" +
                        "<br/> \n" +
                        "Business e-mail: endymionmerrill@gmail.com\n" +
                        "<br/> \n" +
                        "Additional music found at @\n" +
                        "https://www.epidemicsound.com/referra...\n" +
                        "(Get a month free with my referral code)\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Challenges I encountered while living rural: \n" +
                        "- garbage disposal is a bit more complicated\n" +
                        "- In some areas there are limited housing opportunities (even though the rentals I found were affordable, there were not a lot available, which is an issue my town has been dealing with for a while now. However, towns nearby have more rental options.)\n" +
                        "- higher food expenses due to smaller grocery stores with limited backstock. \n" +
                        "- Taking care of a garden or lawn can be expensive (or you can do what I did, which is make friends with the weeds).\n" +
                        "- The more extreme weather means I have to do more frequent fixes on my car. \n" +
                        "- It is hard to find plumbers and handymen, so you have to fix things yourself (and sometimes make expensive mistakes, hehe)\n" +
                        "<br/> \n" +
                        "Ways I budget (while I do not need to do all these things, I like to in order to be more environmentally conscious and work towards my goal of owning a home): \n" +
                        "- I chose low waste recycling options (keeping garbage low reduces expenses since I have to drive to the dump myself.)\n" +
                        "- I shop in bulk when I visit large supermarkets several times a year.\n" +
                        "- I buy clothing and furniture second hand when possible (I love yard sales). \n" +
                        "- I cook with more simple ingredients (cheese toasties and tomato soup are a winner) and grow my own veggies and tea herbs. \n" +
                        "- I limit my driving by trying to plan a lot of errands on the same day. \n" +
                        "- While this isn’t budgeting related, I do love to patronize artists and creators that make work that speak to me. I recently tried to purchase all my Christmas gifts from small businesses. I find it a very meaningful way to connect with other artists.\n" +
                        "- I find I naturally spend less due to not being exposed to as many advertisements on billboards/magazines/internet. I had never realized how much these ads influenced my spending until I moved. Another way I limit this is by pre-downloading tv shows and audiobooks and having set times to use social media, as I do not have wifi at home.   \n" +
                        "- I try to educate myself on financial management as much as possible, prioritizing health insurance if possible and trying to prepare for retirement (even if it’s only a tiny contribution). I know this isn’t always possible for everyone, but the more I learn the more I realized how important it is. \n" +
                        "<br/> \n" +
                        "As I mentioned before, when I first started considering a transition over here I was 21. I eventually did get assistance from my family in order to start a new job. On the internet I notice there are a surprising amount of individuals who find it shameful to get support from others as a young person, but I do not believe that is true. While it is definitely an incredible blessing to have parents that can help you relocate, one that I am very grateful for, there is absolutely nothing wrong with accepting help if you need it (from anyone, not simply family). I have never met anyone who hasn’t received help from someone else during some time in their lives, I think it’s beautiful to build bonds and relationships in this way as long as it’s done with honor and respect for others.\n" +
                        "<br/> \n" +
                        "If there is one thing I’ve found empowering, is finding practical ways to work towards your dreams. Every if it’s baby steps, you can clearly see the progress you are making and feel very motivated to keep working towards your goals.\n",
                0,
                0,
                "https://i.ytimg.com/vi/OHucv0YV9c4/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBxVZGC4Ej_1_83BG_nSt7TjC-1Dw",
                15,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "The Downsides of Life in a Rural Cottage - and why I need a change",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/rf97SOokQaI?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                222567,
                Timestamp.valueOf("2020-11-04 20:00:00.00"),
                "",
                "The Downsides of Life in a Rural Cottage - and why I need a change\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8A\uD83C\uDF44My Etsy Shop: https://www.etsy.com/shop/thecottagef... (I am closing in late November for the rest of 2021! Thank you\uD83D\uDE0A I will RE OPEN for limited sales in 2022)\n" +
                        "<br/> \n" +
                        "It was time for a change. I have found myself not feeling as satisfied with my current work situation, I lacked a feeling of purpose that I always had before when working with children. As it’s tricky simply to start a new job short notice, so I will be working in town for the next several months as holiday help and plan from there. It is a much needed shift to a more social environment, and hopefully a greater work/life balance. I find it very hard to divide work from personal life at home, so I think this will have a wonderful affect on my mental health as well.\n" +
                        "<br/> \n" +
                        "In this video I am sharing some less-than-ideal aspects of living rurally (for me, it may not be the case for someone else). In connection, I wanted to explain why I do not live off grid, and what downsides you may - perhaps - face if you do (which is the reason I live near town). I forgot to mention that I do not have the wish, time to commit, nor the funds to live off grid. It can be very expensive to buy land, build a house, and set up a survival system. I only rent my cottage and am not yet in the position to buy a home, much less build one (the lumber prices lately are insane!). Most people I personally know who live off grid in my valley work remotely so that they can have a flexible schedule, and that is something that I certainly cannot do with my current job. Hope that clarifies things for anyone who was curious! Thank you very much \n" +
                        "<br/> \n" +
                        "❤️No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...\n" +
                        "NOTE: now and then a postcard has been returned to me or lost in the mail. If you have not received a postcard e-mail me at endymionmerrill@gmail.com! I send them out each month! Thank you!\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8BInstagram: https://www.instagram.com/the_cottage...\n" +
                        "<br/> \n" +
                        "\uD83C\uDF0C This video was a collaboration with my brother, Rohan. He has a channel now! https://linktr.ee/rohan_merrill\n" +
                        "<br/> \n" +
                        "Information and conservation efforts in the beautiful Okanogan County: https://methowconservancy.org\n" +
                        "\uD83C\uDF0E Take action to protect our lands (no donations necessary): https://www.audubon.org/takeaction\n" +
                        "\uD83C\uDF19 My favorite charity: https://www.nrdc.org \n" +
                        "☀️Take Action: https://www.sierraclub.org/take-action\n" +
                        "<br/> \n" +
                        "Business e-mail: endymionmerrill@gmail.com\n" +
                        "<br/> \n" +
                        "Additional music found at @\n" +
                        "https://www.epidemicsound.com/referra...\n" +
                        "(Get a month free with my referral code)\n",
                0,
                0,
                "https://i.ytimg.com/vi/rf97SOokQaI/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLC-0_5MDUAHnJ3fboFh-tzIuK605g",
                15,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "My life is changing (and so is this channel)",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/sWfcgeDth_w?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                189165,
                Timestamp.valueOf("2020-10-28 20:00:00.00"),
                "",
                "My life is changing (and so is this channel)\n" +
                        "<br/> \n" +
                        "In this video I am sharing important changes in regards to this channel and my life. Transitions have always been difficult for me and so I wanted to share some ways that I cope with big changes in life (since I am now planning a new career as an art teacher and focusing on my small business). Also, I wanted to make clear that up until next week, my channel has been - for the most part - an individual endeavor. But that is now changing \uD83E\uDD0D and that is extremely exciting!\n" +
                        "<br/> \n" +
                        "Rose Syrup Example (it tastes delicious): https://en.julskitchen.com/preserves/... (I mixed it with club soda)\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8BInstagram: https://www.instagram.com/the_cottage...\n" +
                        "\uD83E\uDD8A\uD83C\uDF44Etsy: https://www.etsy.com/shop/thecottagef...\n" +
                        "<br/> \n" +
                        "❤️ No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...      \n" +
                        "<br/> \n" +
                        "\uD83C\uDF0C This video is a collaboration with my brother Rohan. He has a channel now! https://linktr.ee/rohan_merrill\n" +
                        "<br/> \n" +
                        "Pie recipe inspo (I used my own canned berries): https://honestcooking.com/spring-berr...\n" +
                        "<br/> \n" +
                        "Taking action to help the environment costs nothing but your signature: https://www.audubon.org/takeaction\n" +
                        "<br/> \n" +
                        "Business inquiries: endymionmerrill@gmail.com\n" +
                        "Only business related e-mails please, I see all my YouTube comments so feel free to ask your questions there and I will answer if I am able \uD83D\uDE4F \n" +
                        "<br/> \n" +
                        "All music found at: https://www.epidemicsound.com/referra...\n" +
                        "(Get a month free with my referral code)\n",
                0,
                0,
                "https://i.ytimg.com/vi/sWfcgeDth_w/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLDYgOO18wGWBcDMk_ATQ3AckrVX4A",
                15,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        videos.add(new Video(
                "This is where I live",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/EtAKmIy1HZA?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                415563,
                Timestamp.valueOf("2020-04-29 20:00:00.00"),
                "",
                "“this is where I live” \n" +
                        "To all who are new here, welcome to my valley and my cottage! Today I wanted to take you on a little tour of my favorite places around my home and cottage. I was spending this week foraging new growth mint and mullein, as well as enjoying the delights of spring (the Spring Beauty flowers, in particular). Experiencing the seasons, especially spring, in my rural home is always interesting, providing endless delights.  \n" +
                        "Below linked is more information on mint and mullein, their history and uses.\n" +
                        "<br/> \n" +
                        "You can follow my wonderful brother and camera man Rohan on IG @rohan_merrill\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8A\uD83C\uDF44Etsy: https://www.etsy.com/shop/thecottagef...\n" +
                        "(Flower and herb art back in stock this weekend)\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8BInstagram: https://www.instagram.com/the_cottage...\n" +
                        "<br/> \n" +
                        "\uD83C\uDF0C This video is a collaboration with my brother Rohan. He has a channel now! https://linktr.ee/rohan_merrill\n" +
                        "<br/> \n" +
                        "❤️ No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...      \n" +
                        "<br/> \n" +
                        "Information on Mullein: https://mountainroseherbs.com/mullein...\n" +
                        "Information on Wild Mint: https://eattheplanet.org/wild-mint-fr...\n" +
                        "<br/> \n" +
                        "Taking action to help the environment costs nothing but your signature: https://www.audubon.org/takeaction\n" +
                        "<br/> \n" +
                        "Lentil Soup: https://www.hellofresh.com/recipes/af...\n" +
                        "<br/> \n" +
                        "Business inquiries: endymionmerrill@gmail.com\n" +
                        "Only business related e-mails please, I see all my YouTube comments so feel free to ask your questions there and I will answer if I am able \uD83D\uDE4F \n" +
                        "<br/> \n" +
                        "All music found through a subscription to: Artlist.io \n" +
                        "<br/> \n" +
                        "Artlist Specific License\n" +
                        "License Number - 578124 License owner - Rohan B. Merrill\n" +
                        "<br/> \n" +
                        "Additional music found at @\n" +
                        "https://www.epidemicsound.com/referra...\n" +
                        "(Get a month free with my referral code)\n",
                0,
                0,
                "https://i.ytimg.com/vi/EtAKmIy1HZA/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDktX4qVoxxcueHHJ50BvXUvI0C1Q",
                15,
                8,
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        /* end: life*/
        return videos;
    }

    public Collection<User> initUsers() {
        Collection<User> users = new ArrayList<>();
        //1
        users.add(new User(
                "admin@admin.com",
                "admin",
                "",
                0,
                "",
                "",
                "",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")

        ));
        //2
        users.add(new User(
                "OnlyCProduction@gmail.com",
                "OnlyC",
                "https://yt3.ggpht.com/ytc/AKedOLQP9zdpwh2taUVYk9l222wF0val-5K5YuIAwDZPKw=s88-c-k-c0x00ffffff-no-rj",
                0,
                "OnlyC Production",
                "https://yt3.ggpht.com/ytc/AKedOLQP9zdpwh2taUVYk9l222wF0val-5K5YuIAwDZPKw=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/5M_RTAUzWNyQgIRXIxv4tgYRpdmpAnwwQ6K9tRQcTxZXzkrAj2xnhpsQW_rFAEWSM5M_wDa01w=w1060-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //3
        users.add(new User(
                "toxic@gmail.com",
                "Toxic",
                "https://yt3.ggpht.com/QDp585bDwvybHak4JtHGMiZk8DX-23-oBYMKGSiH7UzUVlX9_dppq7YvP6z58OkWpM4qRocdGA=s88-c-k-c0x00ffffff-no-rj",
                0,
                "Toxic dope",
                "https://yt3.ggpht.com/QDp585bDwvybHak4JtHGMiZk8DX-23-oBYMKGSiH7UzUVlX9_dppq7YvP6z58OkWpM4qRocdGA=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/ezJgFAnIXzk8fCTBXEuS1Uer5YVWjcGvOgQ8llvP1XOcxrwcAKxmiyk4auuEtVlQBcXHXZ6SJw=w1060-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //4
        users.add(new User(
                "nextsports@gmail.com",
                "Next sports",
                "https://yt3.ggpht.com/PvAIR0wanzXo0hFrr9i-JjKGgRuAcljoPtTCXC2xaRgzBipmTkihp9ofgl_m7nzz5U6rcXOw-Q=s88-c-k-c0x00ffffff-no-rj",
                0,
                "NEXT SPORTS",
                "https://yt3.ggpht.com/PvAIR0wanzXo0hFrr9i-JjKGgRuAcljoPtTCXC2xaRgzBipmTkihp9ofgl_m7nzz5U6rcXOw-Q=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/qzwHXiFpQ3YLaQJ_ZR1zh4PBcIyYcIDAVa5fIxJIIIi2CHuh38AAnbK9SmibRCA99H4ortecaA=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")

        ));
        //5
        users.add(new User(
                "btsport@gmail.com",
                "btsport",
                "https://yt3.ggpht.com/ytc/AKedOLTah3wO8rXzUJAUk_Mc2yqGPUTdk6L5809pq9jaoQ=s88-c-k-c0x00ffffff-no-rj",
                0,
                "BT Sport",
                "https://yt3.ggpht.com/ytc/AKedOLTah3wO8rXzUJAUk_Mc2yqGPUTdk6L5809pq9jaoQ=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/yCYpSmTHfYyoUVhAva3o9ZrevdIIJ68zsMhHiIHpaHC43j5WcOeqPfqvocDj8QJRVQCdC9J9fA=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //6
        users.add(new User(
                "publicmovie@gmail.com",
                "publicmovie",
                "https://yt3.ggpht.com/ytc/AKedOLQfbfW-mJ8HTNMKupxnO4ZY6e9k7hW999xj9x6R=s176-c-k-c0x00ffffff-no-rj",
                627000,
                "PUBLIC MOVIE",
                "https://yt3.ggpht.com/ytc/AKedOLQfbfW-mJ8HTNMKupxnO4ZY6e9k7hW999xj9x6R=s176-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/I_t4bqwED544BI6lNlYGdmHhv5YTwte2RcGvFZ5nR3S5lmMQ-CQMEeCVWfSIWxpWc73PM5ZDpGA=w1060-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //7
        users.add(new User(
                "unimovie@gmail.com",
                "Uni Movie",
                "https://yt3.ggpht.com/ytc/AKedOLQBC2iyRXg1owafO_c3GiQapal1OQyDFLngqbff=s68-c-k-c0x00ffffff-no-rj",
                131945907,
                "Uni Movie",
                "https://yt3.ggpht.com/ytc/AKedOLQBC2iyRXg1owafO_c3GiQapal1OQyDFLngqbff=s68-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/dh6ZOTewEwkH_15FDkjOQJ-p0XouJ2jttOtQ25mXDSADivXzIXjqx_gxXvKB5YyglouZO3lPTsc=w1138-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //8
        users.add(new User(
                "web5ngay@gmail.com",
                "Web5Ngay",
                "https://yt3.ggpht.com/ytc/AKedOLRLwdWX77PfslmgtJH8wtSXHdOcq3RBDjjCD3m-kw=s176-c-k-c0x00ffffff-no-rj",
                131945907,
                "Web5Ngay",
                "https://yt3.ggpht.com/ytc/AKedOLRLwdWX77PfslmgtJH8wtSXHdOcq3RBDjjCD3m-kw=s176-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/c7vbA_7oyeBruyDwsAj9myoMYXhkAUUVTn1NMsxxvn8tCJZ-JI0iPV15uiLrzG_TI2YbnerOIQ=w1060-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //9
        users.add(new User(
                "jawonee@gmail.com",
                "jawonee",
                "https://yt3.ggpht.com/ytc/AKedOLTuNh--iqZrlUeCKtIl5qaFUiFa0G7hb5FrsxR74Q=s176-c-k-c0x00ffffff-no-rj",
                190000,
                "jawonee",
                "https://yt3.ggpht.com/ytc/AKedOLTuNh--iqZrlUeCKtIl5qaFUiFa0G7hb5FrsxR74Q=s176-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/AhGiGD3tXhZaVZnUVIFZ6DDxhvqsUdoqEL4kszq1kSTpVnwYqDYyP0PzcTyHCQ4NasLe8vwQ60c=w1138-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //10
        users.add(new User(
                "khanhvy@gmail.com",
                "Khanh Vy",
                "https://yt3.ggpht.com/ytc/AKedOLTUmuZ6Z5eu90eWSpshABEhSx6pyhVxkcOX1sD57Q=s176-c-k-c0x00ffffff-no-rj",
                1420000,
                "Khánh Vy OFFICIAL",
                "https://yt3.ggpht.com/ytc/AKedOLTUmuZ6Z5eu90eWSpshABEhSx6pyhVxkcOX1sD57Q=s176-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/__vhL477RsojgyhqMktAZJehZWSrDnJ4jVnUbRUP9vZgaqaT_mTQaLu0bK5IucpH4cLinfDaJls=w1060-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //11
        users.add(new User(
                "7ngaycongnghe@gmail.com",
                "7ngaycongnghe",
                "https://yt3.ggpht.com/ytc/AKedOLT9iYSOs6sEqdbLAuf53nQ37Ur0rHkAdxVMBXs=s176-c-k-c0x00ffffff-no-rj",
                0,
                "7 Ngày Công Nghệ ",
                "https://yt3.ggpht.com/ytc/AKedOLT9iYSOs6sEqdbLAuf53nQ37Ur0rHkAdxVMBXs=s176-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/42BzT-mHef2bLMiqOsSpkbSpFg0fEBs3TeSk1IkCf_ctMXAe5llLs1uzPd7dxxTcEsVJ078=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //12
        users.add(new User(
                "bloombergtechnology@gmail.com",
                "bloombergtechnology",
                "https://yt3.ggpht.com/ytc/AKedOLQPoMuCqnh_1W0qHoeuGK5h0NDWkEq_bpAmMyBJ=s68-c-k-c0x00ffffff-no-rj",
                0,
                "Bloomberg Technology",
                "https://yt3.ggpht.com/ytc/AKedOLQPoMuCqnh_1W0qHoeuGK5h0NDWkEq_bpAmMyBJ=s68-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/n3MV1g0FCw4gBzmnpC1Rketk-8zP3cbFEmoqE3pEAri1c5VB8EJ6UmEEoDXufDrXUdCm-wNIkvM=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //13
        users.add(new User(
                "coldfusion@gmail.com",
                "coldfusion",
                "https://yt3.ggpht.com/ytc/AKedOLQRGnmWU8PEmyuP6OayR7NfETB-aLi3SIeyhldRzg=s68-c-k-c0x00ffffff-no-rj",
                0,
                "ColdFusion",
                "https://yt3.ggpht.com/ytc/AKedOLQRGnmWU8PEmyuP6OayR7NfETB-aLi3SIeyhldRzg=s68-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/uUUDCpYoqWpb2QRtpo3MjA5ffCg8BNSSIMKK_JfNeAJbru5Z7FeIlhUcPAIKuUHf_uJmwfWT=w2120-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //14
        users.add(new User(
                "jonnajinton@gmail.com",
                "jonnajinton",
                "https://yt3.ggpht.com/ytc/AKedOLRSf5mnTYz_yRpQVviOY-Am5QFT0mHXlvrpZlkwhg=s88-c-k-c0x00ffffff-no-rj",
                0,
                "Jonna Jinton",
                "https://yt3.ggpht.com/ytc/AKedOLRSf5mnTYz_yRpQVviOY-Am5QFT0mHXlvrpZlkwhg=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/Kz7ICGetfcGqd50ZN5P95_E8bfHcy7MrNTqCgTsy376l3FKnXUu8drjZBfwPsYgV7vS7k_Zg=w2120-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //15
        users.add(new User(
                "thecottagefairy@gmail.com",
                "thecottagefairy",
                "https://yt3.ggpht.com/ARBjsHd7IJRxF2LjirBJAMqAvBxIjUp5REeUibWxzNJ5q7H-8LkSOmrsx_jj3CNipa77znWL=s88-c-k-c0x00ffffff-no-rj",
                0,
                "TheCottageFairy",
                "https://yt3.ggpht.com/ARBjsHd7IJRxF2LjirBJAMqAvBxIjUp5REeUibWxzNJ5q7H-8LkSOmrsx_jj3CNipa77znWL=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/xSkVpjSOdxVoq_f_6qOIQU-gGeIm7XMqd8EZh_ON9PGkpOrIAnFEYmwtYuyIuoRwo9Ip326UFg=w2120-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //16
        users.add(new User(
                "baotuoitre@gmail.com",
                "baotuoitre",
                "https://yt3.ggpht.com/ytc/AKedOLS5BIK9LUNgfoYekApq9lJINIaeLQCj7MnsE68Okg=s88-c-k-c0x00ffffff-no-rj",
                0,
                "Báo Tuổi Trẻ ",
                "https://yt3.ggpht.com/ytc/AKedOLS5BIK9LUNgfoYekApq9lJINIaeLQCj7MnsE68Okg=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/HFy-cZSs1lzTaZzogd-Ywtkrd9fDRjF77FLho6bZ1V7dLPGuVlJCYAL7k6qan-3kOAVzb8mxwA=w2120-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //17
        users.add(new User(
                "vtcnow@gmail.com",
                "vtcnow",
                "https://yt3.ggpht.com/y9CMqrQCkIPpx5dAVBdLmCrokX6K6ZJv10Rz3oUkGg0gzjWpCghwN6UhYP3Cx2eZMae9u1-jVw=s88-c-k-c0x00ffffff-no-rj",
                0,
                "VTC NOW",
                "https://yt3.ggpht.com/y9CMqrQCkIPpx5dAVBdLmCrokX6K6ZJv10Rz3oUkGg0gzjWpCghwN6UhYP3Cx2eZMae9u1-jVw=s88-c-k-c0x00ffffff-no-rj",
                "https://i.ytimg.com/vi/1XLMISGDjeA/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB8zwNT9suEP3fAPcmBnszxXI-04Q",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //18
        users.add(new User(
                "gaubeovungve@gmail.com",
                "aubeovungve",
                "https://yt3.ggpht.com/xhscPWZJqzgfISL5imqtrpzpNtBRR2cwZiYiVwuJFHPg7XkTaOqvRDXcfdWDbUk7gxJs_WLqOg=s176-c-k-c0x00ffffff-no-rj-mo",
                0,
                "Gấu Béo Vụng Về",
                "https://yt3.ggpht.com/xhscPWZJqzgfISL5imqtrpzpNtBRR2cwZiYiVwuJFHPg7XkTaOqvRDXcfdWDbUk7gxJs_WLqOg=s176-c-k-c0x00ffffff-no-rj-mo",
                "https://yt3.ggpht.com/Wv_cnAQVxBkyFdxJIjlu6rO7vytK4fH-u2vGL1cysMMA-uYJ5DaNDRCcSji_WaZJp0RR2K60ag=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //19
        users.add(new User(
                "hakhuat@gmail.com",
                "hakhuat",
                "https://yt3.ggpht.com/ytc/AKedOLSo0gM8RbZ-jWdllvpGlpKHvLUv7e_mw_FiLSMA=s88-c-k-c0x00ffffff-no-rj",
                0,
                "Hà Khuất",
                "https://yt3.ggpht.com/ytc/AKedOLSo0gM8RbZ-jWdllvpGlpKHvLUv7e_mw_FiLSMA=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/PmOhKU8Sb-RfrzUDLdGusMS6NW_7Tsi422_Irnir4YQycr7MTjkaD7CO7rp6SsHSWILyoUcnBQ=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        //20
        users.add(new User(
                "halinh@gmail.com",
                "halinh",
                "https://yt3.ggpht.com/ytc/AKedOLRsTk5m6bvl-Ce1DRsp1YbWV4196gfydfUuiXKHCg=s88-c-k-c0x00ffffff-no-rj",
                0,
                "Ha Linh Official",
                "https://yt3.ggpht.com/ytc/AKedOLRsTk5m6bvl-Ce1DRsp1YbWV4196gfydfUuiXKHCg=s88-c-k-c0x00ffffff-no-rj",
                "https://yt3.ggpht.com/kK2_lWmLdJtyem_b20RlQfbUlWzaW96ZRwuGzrG0rHpznlkw537TLGiLrqGBDPWSWsrd2jor9AE=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj",
                Timestamp.from(Instant.now()),
                Long.valueOf("0"),
                Timestamp.from(Instant.now()),
                Long.valueOf("0")
        ));
        return users;
    }

    public void init() {

        Collection<Category> categories = initCategories();
        for (Category category : categories) {
            categoryDAO.insert(category);
        }

        Collection<User> users = initUsers();
        for (User user : users) {
            userDAO.insert(user);
        }

        Collection<Video> videos = initVideos();
        for (Video video : videos) {
            videoDAO.insert(video);
        }
    }
}
