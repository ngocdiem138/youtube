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
                "C?? L??? ANH CH??A T???NG - ONLY C ft. KARIK | OFFICIAL MUSIC VIDEO",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/g_TGYUr0Lcs?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                11417041,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "#CoLeAnhChuaTung #OnlyC #Karik",
                "C?? L??? ANH CH??A T???NG - ONLY C ft. KARIK |  OFFICIAL MUSIC VIDEO\n" +
                        "<br/> \n" +
                        "\uD83C\uDFB5 Nghe Audio t???i:\n" +
                        "<br/> \n" +
                        "?????? https://onlyc.streamlink.to/CoLeAnhCh...\n" +
                        "<br/> \n" +
                        "?????? https://zingmp3.vn/bai-hat/Co-Le-Anh-...\n" +
                        "<br/> \n" +
                        "Music Director: OnlyC\n" +
                        "Composer: OnlyC\n" +
                        "Rap: Karik\n" +
                        "Lyrics: Lou Ho??ng - OnlyC\n" +
                        "Music Producers: OnlyC ??? Justin TechN9\n" +
                        "Mixing: D????ng StillaD\n" +
                        "Guitar: Danh T??\n" +
                        "Master: Dz??ng Ezee\n" +
                        "Recording: ZIKZAK\n" +
                        "Studio: OnlyC Production\n" +
                        "Project Director: Nguy???n Ng??n H??\n" +
                        "Executive Producer: Nguy???n Mai\n" +
                        "Starring: Ki???u Minh Tu???n ??? T?? H???o ??? b?? Minh Anh\n" +
                        "PR and Social Manager: Nh???t Duy L??\n" +
                        "Artist Assistant: Ken DC\n" +
                        "Stylist: Ho??ng Ku \n" +
                        "Stylist Assistant: My Tr????ng ??? Duy Kh??nh ??? Gia Tr??n\n" +
                        "Support: Remizio ??? The Tuxedo ??? Choice ??? The Country Boutiques ??? The Twenty Three ??? The Maven ??? Chaiko House ??? Dottie Premium ??? L???allee\n" +
                        "Make up ??? Hair Artist : Mimi (L??m Ng???c Minh) ??? Ng???c Lam -  Phan Uy???n Khi???t\n" +
                        "Make up Assistant : Chu H???ng M??? Linh\n" +
                        "Graphic Designer: Tu???n Maxx - ??inh Thi??n Ph??\n" +
                        "Behind the scenes: T??o ??? L?? V??n Ph????ng - Nicki\n" +
                        "Photographer: Ki???t V?? - T??o\n" +
                        "Photographic Assistant: B?? Ki???t\n" +
                        "<br/> \n" +
                        "Production house: 7Arts\n" +
                        "Director: Phan L??n\n" +
                        "Creative Director: William \n" +
                        "Producer: Hi???u Nguy???n\n" +
                        "Director of Photography: Trang C??ng Minh \n" +
                        "Camera operator: Ng?? Ng???c Th???ch\n" +
                        "Focus Puller: Nghiem Duy Hai\n" +
                        "1st Ad: Ph???m Nguy???n B???o Ho??ng\n" +
                        "Assitant Producer: Kim Ng??n Tr????ng - V?? H???u Ph?????c \n" +
                        "Art Director: Mee Ho??ng\n" +
                        "Props team: V?? Tr???n\n" +
                        "Camera: PS \n" +
                        "Lighting: Cine Light\n" +
                        "Catering: Huynh Nhuc Team\n" +
                        "Editor: L?? H???ng Thu???\n" +
                        "Colorist : Rei Arte \n" +
                        "VFX : Human House\n" +
                        "<br/> \n" +
                        "?????????More information about OnlyC: \n" +
                        "Facebook: https://www.facebook.com/OnlyCproducer \n" +
                        "Instagram: https://instagram.com/onlycproducer \n" +
                        "????????? More information about OnlyC Entertainment: \n" +
                        "Facebook: https://m.facebook.com/OnlyC.Entertai... \n" +
                        "Instagram: https://instagram.com/onlycent.official\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "#CoLeAnhChuaTung #OnlyC #Karik \n" +
                        "??? Subscribe ????? ???ng h??? Only C nh??: https://goo.gl/5rtk22\n" +
                        "??? Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "<br/> \n" +
                        "Lyric:\n" +
                        "-----------------\n" +
                        "?? B???n quy???n thu???c v??? OnlyC Production\n" +
                        "?? Copyright by OnlyC Production ??? Do not Reup",
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
                "Y??U ????N PH????NG ( AUDIO REMASTERED ) | ONLYC x KARIK",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/d93HEYFWasQ?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                35140,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#onlyc #karik #yeudonphuong",
                "Y??U ????N PH????NG | ONLYC x KARIK | AUDIO REMASTERED\n" +
                        "<br/> \n" +
                        "#onlyc #karik #yeudonphuong\n" +
                        "<br/> \n" +
                        "*Lyric*\n" +
                        "???? bi???t ch???c s??? nh?? th??? n??y\n" +
                        "Th???c tr???ng su???t m???y ????m v?? em\n" +
                        "1 l???n n???a l???i bi???t y??u...\n" +
                        "Sao kh??ng b??n anh , sao l???i nh?? th??? khi...\n" +
                        "Bi???t bao l??u ???? v?? em kh??ng quan t??m ?????n b???t k??? ai\n" +
                        "Tr??i tim n??y l?? thu???c v??? em c?? hay\n" +
                        "S??? kh??ng ai khi???n anh l??i b?????c\n" +
                        "Ch??? mong ai qua l???i v??? , d?? cho em...\n" +
                        "<br/> \n" +
                        "D?? cho ???? bi???t , n???u ????m ?????u y??u ????n ph????ng s??? kh??ng ai th???u m??nh ??au\n" +
                        "?????i ch??? 1 ng?????i nh?? th??i quen ???? t??? l??u\n" +
                        "D?? cho c??? g???ng ?????n mai sau cho d?? c?? d??u s??nh ????i c??ng b??n ai\n" +
                        "????nh ng???m ng??i c??u h??t man m??c y??u ng?????i ????n ph????ng\n" +
                        "<br/> \n" +
                        "K??? t??? ng??y m??nh g???p h??m ???y , anh ???? bi???t ch???c c?? h??m nay\n" +
                        "1 ng??y n???i nh??? d??ng ?????y , xung quanh h??nh ???nh em bao v??y \n" +
                        "Loay hoay m??i trong l??ng 1 c??u , ???b??y gi??? ph???i l??m sao ????y ???? \n" +
                        "Khi t??m n??i anh ph???i bu??ng tay nh??ng tim van n??i anh ?????ng th??o ch???y\n" +
                        "Anh...t??? bi???t th??n l?? k??? ?????n sau\n" +
                        "C??n em nh?? l?? con thuy???n k??? t??? nay ???? c?? b???n ?????u\n" +
                        "N??n ch???ng mong , ch???ng c???u , tr???i mang m??nh ?????n b??n nhau\n" +
                        "Ch??? xin k??? ni???m ??? l???i , n???i nh??? n??y ?????ng th??m s??u\n" +
                        "V?? y??u ????n ph????ng l?? t??? nguy???n ??au , l?? ??m th???m nh???\n" +
                        "L?? ch???p nh???n cu???i ?????u tr?????c duy??n s??? , ng??y ????m ??m th???m ch???\n" +
                        "Xin c??? ????? n?????c m???t anh r??i cho tr???n ch??n th??nh 1 ng?????i ?????ng sau\n" +
                        "Em kh??ng c???n ????p tr??? t??nh c???m 1 g?? si t??nh nh?? l?? anh ????u\n" +
                        "(H??y ????? n?????c m???t anh r??i cho tr???n ch??n th??nh 1 ng?????i ?????n sau\n" +
                        "D?? ???? bi???t c?? c??? g???ng m???y em m??i m??i ch???ng thu???c v??? anh ????u)\n" +
                        "<br/> \n" +
                        "Em ??i cho t??i hay ??i???u g?? l??m tan bi???n h???t si m??\n" +
                        "Khi con tim ???? kh???c t??n em bao ng??y ,\n" +
                        "Ngay t??? ???y ?????n mai sau n??y , lu??n m??i nh?? v???y\n" +
                        "????nh l??ng v???n y??u d?? ????n ph????ng\n" +
                        "<br/> \n" +
                        "Anh bi???t m??nh ???? th???t kh??? d???i khi lu??n t???n t??m v???i t??nh y??u n??y\n" +
                        "Tr?????c h??ng tr??m l?? do t???n th????ng b???n th??n nh??ng ch???ng th??? n??o bu??ng tay\n" +
                        "Nh??ng kh??ng sao , anh ch???p nh???n , c?? ra sao , v???n ch???p nh???n\n" +
                        "Anh ch???p nh???n m??i ?????ng ????y tr??ng theo h???nh ph??c em ch???n l???n theo t???ng ng??y\n" +
                        "Ch???p nh???n t??nh c???m m??nh l???n l??n nh??ng kh??ng bao gi??? ???????c g???i ?????n\n" +
                        "Ch???p nh???n m??i m??i b??? l??ng qu??n v???i k?? ???c ch??a t???ng ?????t t??n \n" +
                        "V?? anh ch???p nh???n t???t c??? d?? s??? ch???ng c??n ???????c k??? b??n \n" +
                        "??? Subscribe ????? ???ng h??? Only C nh??: https://goo.gl/5rtk22\n" +
                        "??? Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "?? B???n quy???n thu???c v??? OnlyC Production\n" +
                        "?? Copyright by OnlyC Production ??? Do not Reup",
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
                "??AU ????? TR?????NG TH??NH | ONLYC | LIVE VERSION",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ReQqd2lNBjM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                119872,
                Timestamp.valueOf("2021-05-19 20:00:00.00"),
                "#daudetruongthanh #ddtt #onlyc",
                "??AU ????? TR?????NG TH??NH | ONLYC | STAGE VERSION\n" +
                        "#daudetruongthanh #ddtt #onlyc\n" +
                        "Link Spotify : https://open.spotify.com/track/5iMdP8...\n" +
                        "Link MP3 : https://zingmp3.vn/bai-hat/Dau-De-Tru...\n" +
                        "-----------------\n" +
                        "?????O DI???N : PH?????C ?????NG\n" +
                        "MUSIC COMPOSER : ONLYC\n" +
                        "GUITAR : DANH T??\n" +
                        "KEYBOARD : JUSTIN TECHN9\n" +
                        "ELECTRIC GUITAR : KAN\n" +
                        "DRUM : TR???N H???U\n" +
                        "GUITAR BASS : HUYBOTHAI\n" +
                        "-----------------\n" +
                        "Lyric :\n" +
                        "Y??u, ai m?? ch???ng c?? l??c bu???n\n" +
                        "Th????ng, ai r???i c??ng ?????n l??c bu??ng\n" +
                        "??? th?? a ph???i ?????ng d???y th??i, nh???t k?? c???t ??i r???i\n" +
                        "Th??i n??i ra l??m g?? l???i c??ng th??m ??au\n" +
                        "N???u quay th???i gian ?????n l??c ?????u\n" +
                        "????? n??i r???ng: n??y ch??ng trai h??y nh??? cho\n" +
                        "Ng?????i con g??i c?? ????n l???m ?????y, t???i sao ko n??u l???y?\n" +
                        "????? m???t ??i 1 ng?????i ch??? v?? v?? t??m\n" +
                        "<br/> \n" +
                        "C?? nh???ng ??i???u m?? a mu???n n??i\n" +
                        "Kh??ng k???p ????u ???? qu?? mu???n r???i\n" +
                        "C?? nh???ng ??i???u m?? a t???ng ng?? l?? l???i l?? ?????c m?? bao ng?????i\n" +
                        "L?? t???i anh, n???i ??au ??i ?????n su???t ?????i\n" +
                        "Khi y??u ch??? c???n nh?? th???\n" +
                        "Chia tay c?? khi l??m m??nh l???n l??n\n" +
                        "M???i khi bu???n th?? em c??? kh??c\n" +
                        "Kh??c th???t to m???i a nghe th??i\n" +
                        "M???i khi ??au ni???m ??au c??ng x?? ????i, v?? a v???n y??u e nhi???u\n" +
                        "D??ng th???i gian s??? tr??i ????? a th???y r???ng\n" +
                        "Chia tay th?? ta m???i th???u m??nh ???? sai t??? ????u...\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "??? Subscribe ????? ???ng h??? Only C nh??: https://goo.gl/5rtk22\n" +
                        "??? Fanpage: https://www.facebook.com/OnlyCproducer\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "?? B???n quy???n thu???c v??? OnlyC Production\n" +
                        "?? Copyright by OnlyC Production ??? Do not Reup",
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
                "Y??U EM D???I KH??? | LOU HO??NG | OFFICIAL MV",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/KyXKGurjX_4?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                48826681,
                Timestamp.valueOf("2018-12-21 20:00:00.00"),
                "",
                "Y??U EM D???I KH???\n" +
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
                        "Stylist : Thi??n Thanh \n" +
                        "Make up : Mimi \n" +
                        "Assistant : Ken DC, Thai Duong ,Vu Map , Nh???t H??a, Th??nh ?????t \n" +
                        "Trang ph???c TRENDIANO - AEIE STUDIO\n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "*Lyrics by Lou Hoang \n" +
                        "<br/> \n" +
                        "Th???c tr???ng ????m nay c?? l??? do anh ??ang say \n" +
                        "Bi???t n??i cho ai nghe ????y b???i v?? kh??ng c??n ???????c b??n em m???i ng??y \n" +
                        "M??nh t???ng h???a s??? v?????t qua \n" +
                        "V???y m?? k???t th??c r???i xa \n" +
                        "C??? sao anh c??? mong ch??? v?? anh ???? y??u d???i kh??? \n" +
                        "T???ng c??ng nhau ??i qua gi??ng b??o nh??ng ko c??n th???y nhau khi m??a tan\n" +
                        "T???i v?? sao t??nh y??u lu??n khi???n cho m??nh m??i tin v??o m???t gi???c m??\n" +
                        "Ng??y em quay l??ng b?????c ??i m??a r??i ?????t nh??e l??n tr??n kh??e mi \n" +
                        "V?? khi y??u ch???ng c???n l?? tr?? m???c k??? con tim l??m ??i???u v?? l??. \n" +
                        "<br/> \n" +
                        "?????ng trao nhau ??n ??i nh???t m??u ?????ng ????? tr??i tim c??? m??i u s???u \n" +
                        "C?? ????i khi m???t qu?? v?? mu???n r???i xa \n" +
                        "H??y nh??? l?? do v?? sao hai ta b???t ?????u \n" +
                        "L???i chia tay kh??ng n??i th??nh l???i\n" +
                        "V?? em c??ng ??au khi ta xa r???i \n" +
                        "Ph???i ko ng?????i ??i, l??? r??i tim anh ch??i v??i \n" +
                        "<br/> \n" +
                        "V?? a ???? y??u e d???i kh??? ??? d?? b?? v?? \n" +
                        "T??nh y??u ???y m??i ko phai m??? a lu??n t??n th??? ?? \n" +
                        "Ch???ng th??? x??a ??i nh???ng vui c?????i ng??y n??o b??n em \n" +
                        "C??ng kh??ng mu???n t????ng lai y??u ng?????i nao kh??c em \n" +
                        "V?? a ???? y??u e d???i kh???\n" +
                        "Th???i gian qua nhi???u phong ba l??m cho ta t??? g??y ra ??i???u bu???n b?? l???i c??i v?? r???i chia xa \n" +
                        "Pick up the phone v?? t??nh gi???ng e vang l??n \n" +
                        "V???y n???u kh??ng n??i g?? th??m th??i t??? nay n??n qu??n t??n \n" +
                        "Stop it th??i ?????ng n??i nhi???u th??m gi??? qu??n ???????c ch??a \n" +
                        "B??y gi??? ???? qu?? tr??? ????? c?? th??? quay l???i y??u l???n n???a \n" +
                        "T???m bi???t t???t c??? nh???ng l???i h???a d???i tr?? \n" +
                        "Nh???ng g?? ???? tr??i qua \n" +
                        "T???m h??nh c?? ????i ta \n" +
                        "X??a s???ch h???t ph??i pha\n" +
                        "<br/> \n" +
                        "??? Subscribe ????? ???ng h??? Only C nh??: https://goo.gl/5rtk22\n" +
                        "??? Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "-----------------\n" +
                        "?? B???n quy???n thu???c v??? OnlyC Production\n" +
                        "?? Copyright by OnlyC Production ??? Do not Reup",
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
                "QUAN TR???NG L?? TH???N TH??I | ONLYC ft KARIK | OFFICIAL VIDEO LYRIC",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/JqWuzvSMs08?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                50448415,
                Timestamp.valueOf("2018-03-15 20:00:00.00"),
                "",
                "Quan Tr???ng L?? Th???n Th??i | OnlyC ft Karik | Official Video Lyric\n" +
                        "Compose : Only C, Karik\n" +
                        "Graphic Design : B???o B???o\n" +
                        "Video Editor : RIN\n" +
                        "<br/> \n" +
                        "*Lyric*\n" +
                        "Quan tr???ng ph???i l?? th???n th??i\n" +
                        "Quan tr???ng khi l?? con g??i , \n" +
                        "Bao gi??? y??u th?? lu??n ????ng , ch???ng bao gi??? th???y sai\n" +
                        "Quan tr???ng v???n l?? th???n th??i\n" +
                        "Khi m??nh y??u l?? con trai , \n" +
                        "D???u ng?????i ta g???i m??nh ??i , c??ng ch???ng c?? g?? ????? sai.\n" +
                        "<br/> \n" +
                        "T???t h??n l?? m??nh th???y th???n th??i n???m ????u\n" +
                        "T???t h??n l?? m??nh th???y th???n th??i ?????m s??u\n" +
                        "T???t h??n l?? m??nh th???y th???n th??i n???m ????u ,th???y th???n th??i n???m ????u ,th???y th???n th??i nh?? n??o\n" +
                        "<br/> \n" +
                        "Quan tr???ng ! v???n l?? c??i th???n th??i\n" +
                        "Quan tr???ng ! v???n l?? c??i th???n th??i\n" +
                        "Ai khen ch?? c??? m???c k??? , m??nh c??? ng???u c?? g?? ph???i ng???n ng???i\n" +
                        "V?? m??nh ?????p ch??? n??o t??? m??nh bi???t , m??nh x???u ch??? n??o c??ng m??nh bi???t \n" +
                        "C??i g?? c???a m??nh t??? m??nh quy???t ????? t??m l??m g?? m???y l???i kh??ng c???n thi???t\n" +
                        "B???i c?? b???n x?? h???i v???n th??? phi , b???t k??? l?? chuy???n l???n hay l?? vi???c li ti\n" +
                        "M??nh l??m g?? ??i n???a th?? h??? v???n d??? ngh??? , th??? n??n k??? ??i h??i ????u m?? suy ngh??\n" +
                        "Quan tr???ng nh???t kh??ng ph???i v??? b??? ngo??i\n" +
                        "X???u , ?????p , ch??n ng???n hay ch??n d??i\n" +
                        "M??nh ??ang ch??i hay l?? ?????ng g???n ai\n" +
                        "M?? quan tr???ng l??...\n" +
                        "<br/> \n" +
                        "Bi???n ng?????i bi???n kh???u lung tung , ????ng hay sai mi???ng ?????i v???n d???y s??ng\n" +
                        "T???t nh???t b???n th??n c??? ung dung , ????? ra ???????ng n??o b??? c??n bay b???ng\n" +
                        "N???u cong kh??ng th???ng th?? ???? sao ?\n" +
                        "L??? thua kh??ng th???ng th?? ???? sao ?\n" +
                        "??en ????a kh??ng tr???ng th?? ???? sao ?\n" +
                        "M??nh v???n s???ng v?? ?????u c??? ng???ng cao...\n" +
                        "D?? l??n voi , hay xu???ng ch?? , nh?? m??nh gi??u hay kh??ng b???ng ch??ng n??\n" +
                        "B?????c ra ???????ng , v???n ph???i t???nh , d?? cho c?? bao nhi???u th???ng ?????ng ng??\n" +
                        "V?? quan tr???ng kh??ng ph???i v??? b??? ngo??i\n" +
                        "X???u , ?????p , ch??n ng???n hay ch??n d??i\n" +
                        "M??nh ??ang ch??i hay l?? ?????ng g???n ai\n" +
                        "M?? quan tr???ng l?? l?? l??...\n" +
                        "<br/> \n" +
                        "Ch??i l??n ch??i l??n .... Ai ko ch??i anh em tui ch??i\n" +
                        "....\n" +
                        " Quan tr???ng ph???i l?? th???n th??i ,quan tr???ng ph???i l?? th???n th??i ,quan tr???ng v???n l?? th???n th??i....\n" +
                        "<br/> \n" +
                        "??? Subscribe ????? ???ng h??? Only C nh??: https://goo.gl/5rtk22\n" +
                        "??? Facebook: https://www.facebook.com/onlyC.pro\n" +
                        "-----------------\n" +
                        "?? B???n quy???n thu???c v??? OnlyC Production\n" +
                        "?? Copyright by OnlyC Production \n" +
                        "??? Do not Reup",
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
                "??m em l???n cu???i - Nit ft. Sing ?? 1 9 6 7 (\uD835\uDE68\uD835\uDE61\uD835\uDE64\uD835\uDE6C\uD835\uDE5A\uD835\uDE59 + \uD835\uDE67\uD835\uDE5A\uD835\uDE6B\uD835\uDE5A\uD835\uDE67\uD835\uDE57) /Toxic dope/",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/mi4_kT20JqY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                10651,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "#omemlancuoi #Nit #toxicdope",
                "??m em l???n cu???i - Nit ft. Sing ?? 1 9 6 7 (\uD835\uDE68\uD835\uDE61\uD835\uDE64\uD835\uDE6C\uD835\uDE5A\uD835\uDE59 + \uD835\uDE67\uD835\uDE5A\uD835\uDE6B\uD835\uDE5A\uD835\uDE67\uD835\uDE57) /Toxic dope/\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "??MV g???c:https://youtu.be/g337dA9zX3A\n" +
                        "??Lofi 1967:https://youtu.be/C9JfJZjzaFw\n" +
                        "<br/> \n" +
                        "??????????????????????????????\n" +
                        "<br/> \n" +
                        "???Video n??y ch??? d??ng ????? t???n h?????ng ??m nh???c v?? gi???i tr??, kh??ng mang m???c ????ch thu l???i c?? nh??n.\n" +
                        "???H??nh ???nh, ??m thanh trong video ?????u ghi c??ng cho ngh??? s??/ch??? s??? h???u ban ?????u.\n" +
                        "???N???u c?? b???t c??? th??ng tin quy ph???m b???n quy???n th?? m??nh s??? xin ph??p g??? b??? ngay.\n" +
                        "<br/> \n" +
                        "???Ch??c c??c bn c?? nh???ng gi??y ph??t th?? gi??n^^\n" +
                        "???Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "??????????????????????????????\n" +
                        "<br/> \n" +
                        "???Lyrics:\n" +
                        "<br/> \n" +
                        "Ch?? v?? c?? ????n b???o ng??y r???i ?????y\n" +
                        "Sao anh ch???ng th??? qu??n ??i ???????c em ???\n" +
                        "Anh ??m k?? ???c ????i ta ???? t???ng c??\n" +
                        "L???ng th???m m??nh anh c??ng bao n???i ??au\n" +
                        "<br/> \n" +
                        "Ch???ng ngh?? c?? l??c anh ph???i xa em th???t r???i\n" +
                        "Bao ????m anh v???n suy t?? v??? em\n" +
                        "D???n l??ng m??nh ph???i qu??n em ,?????ng b???t kh??c???\n" +
                        "M???t l???n n??y th??i mong em v??? ????y\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Ng?????i n??i s??? y??u anh m??i ?????m s??u\n" +
                        "Ng?????i n??i s??? b??n anh m??i th???t l??u\n" +
                        "M?? c??? v?? sao em quay ?????u , ??i v??? n??i xa x??i qu??aa\n" +
                        "<br/> \n" +
                        "T??nh ???? nh???t phai theo gi?? v?? m??y\n" +
                        "Gi??? ch??? c??n bao n???i nh??? ??? ????y\n" +
                        "Mu???n ??m em th??m m???t l???n cu???i th??i???.\n" +
                        "<br/> \n" +
                        "end..\n" +
                        "------------------------\n" +
                        "?? B???n Quy???n Thu???c V??? 1 9 6 7 ??? Vui L??ng Kh??ng Reup D?????i M???i H??nh Th???c!!!\n" +
                        "?? M???i th??ng tin b???n quy???n hay khi???u n???i li??n h???: Contact@1967ent.com\n" +
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
                "/??i theo ??nh n???ng chi???u t??n,ph??a cu???i d??ng ng?????i../??nh chi???u t??n - D Empty ?? Poll | slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/eZNO0RRwebA?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                181683,
                Timestamp.valueOf("2021-07-16 20:00:00.00"),
                "",
                "???Video n??y ch??? d??ng ????? t???n h?????ng ??m nh???c v?? gi???i tr??, kh??ng mang m???c ????ch thu l???i c?? nh??n.\n" +
                        "???H??nh ???nh, ??m thanh trong video ?????u ghi c??ng cho ngh??? s??/ch??? s??? h???u ban ?????u.\n" +
                        "???N???u c?? b???t c??? th??ng tin quy ph???m b???n quy???n th?? m??nh s??? xin ph??p g??? b??? ngay.\n" +
                        "<br/> \n" +
                        "???Ch??c c??c bn c?? nh???ng gi??y ph??t th?? gi??n^^\n" +
                        "???Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "??MV g???c: https://youtu.be/AOYdD-3ole0\n" +
                        "??M???i khi???u n???i v??? b???n quy???n xin li??n h???: Toxicdope.911@gmail.com",
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
                "/V?? n???u th???i gian quay v??? ????y,li???u tr??i tim kia../Trong tr?? nh??? c???a anh - Erik cover | slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/rjF850oB3cg?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1367871,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "???Video n??y ch??? d??ng ????? t???n h?????ng ??m nh???c v?? gi???i tr??, kh??ng mang m???c ????ch thu l???i c?? nh??n.\n" +
                        "???H??nh ???nh, ??m thanh trong video ?????u ghi c??ng cho ngh??? s??/ch??? s??? h???u ban ?????u.\n" +
                        "???N???u c?? b???t c??? th??ng tin quy ph???m b???n quy???n th?? m??nh s??? xin ph??p g??? b??? ngay.\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "???Ch??c c??c bn c?? nh???ng gi??y ph??t th?? gi??n^^\n" +
                        "???Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "??MV g???c: https://youtu.be/0Jh2-uDQdoY \n" +
                        "??M???i khi???u n???i v??? b???n quy???n xin li??n h???: Toxicdope.911@gmail.com",
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
                "/V?? r???i anh c??ng s??? ph???i nh???n ra,em ???? ??i xa t??? h??m qua../ slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MAyItwTL3rg?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                104062,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "???Video n??y ch??? d??ng ????? t???n h?????ng ??m nh???c v?? gi???i tr??, kh??ng mang m???c ????ch thu l???i c?? nh??n.\n" +
                        "???H??nh ???nh, ??m thanh trong video ?????u ghi c??ng cho ngh??? s??/ch??? s??? h???u ban ?????u.\n" +
                        "???N???u c?? b???t c??? th??ng tin quy ph???m b???n quy???n th?? m??nh s??? xin ph??p g??? b??? ngay.\n" +
                        "<br/> \n" +
                        "???Ch??c c??c bn c?? nh???ng gi??y ph??t th?? gi??n^^\n" +
                        "???Page:https://www.facebook.com/toxicdope911/\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "??MV g???c: https://youtu.be/FWYrRSWabIs\n" +
                        "??M???i khi???u n???i v??? b???n quy???n xin li??n h???: Toxicdope.911@gmail.com",
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
                "/Gi?? ng??n nga ??u y???m bay phi??u b???ng../N???m ????i b??n tay - Kay Tr???n | slowed",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/EYLKu9ICSIs?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                9567,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "???Video n??y ch??? d??ng ????? t???n h?????ng ??m nh???c v?? gi???i tr??, kh??ng mang m???c ????ch thu l???i c?? nh??n.\n" +
                        "???H??nh ???nh, ??m thanh trong video ?????u ghi c??ng cho ngh??? s??/ch??? s??? h???u ban ?????u.\n" +
                        "???N???u c?? b???t c??? th??ng tin quy ph???m b???n quy???n th?? m??nh s??? xin ph??p g??? b??? ngay.\n" +
                        "<br/> \n" +
                        "???Ch??c c??c bn c?? nh???ng gi??y ph??t th?? gi??n^^\n" +
                        "???Page:https://www.facebook.com/toxicdope911\n" +
                        "<br/> \n" +
                        "------------------------\n" +
                        "??MV g???c: https://youtu.be/7nB1q65RP8w\n" +
                        "??M???i khi???u n???i v??? b???n quy???n xin li??n h???: Toxicdope.911@gmail.com",
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
                "Tr???c ti???p | ??T VI???T NAM T???P LUY???N CHI???U 3/11, C??NG PH?????NG L???I THAY ?????I KI???U T??C !",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/mRVBd5pOdxE?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                14343,
                Timestamp.valueOf("2021-11-03 20:00:00.00"),
                "#NextSports #DTVN #VongloaiWorldCup",
                "Tr???c ti???p | ??T VI???T NAM T???P LUY???N CHI???U 3/11, C??NG PH?????NG L???I THAY ?????I KI???U T??C !\n" +
                        "<br/> \n" +
                        "Chi???u 3/11, ??T Vi???t Nam s??? ti???p t???c t???p luy???n ????? chu???n b??? cho 2 tr???n ?????u di???n ra trong th??ng 11 thu???c v??ng lo???i th??? ba World Cup 2022. M???i qu?? v??? v?? c??c b???n ch?? ?? ????n xem!\n" +
                        "<br/> \n" +
                        "#NextSports #DTVN #VongloaiWorldCup\n" +
                        "<br/> \n" +
                        "??? K??nh Youtube ch??nh th???c, ????ng k?? ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - ?????ng h??nh c??ng th??? thao Vi???t Nam tr??n m???i ch???ng ???????ng!",
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
                "H??NH TR??NH L???CH S??? U23 VI???T NAM VCK U23 CH??U ?? I NH???NG SI??U PH???M PH??T CU???I V?? LO???T PENALTY ?????NH M???NH",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Z4K78CKKmxo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                6867,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "NEXT SPORTS | H??NH TR??NH L???CH S??? U23 VI???T NAM VCK U23 CH??U ?? I NH???NG SI??U PH???M PH??T CU???I V?? LO???T PENALTY ?????NH M???NH\n" +
                        "<br/> \n" +
                        "??? K??nh Youtube ch??nh th???c, ????ng k?? ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - ?????ng h??nh c??ng th??? thao Vi???t Nam tr??n m???i ch???ng ???????ng!",
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
                "PARK HANG SEO - V??? THUY???N TR?????NG V?? ?????I C???A B??VN, ?????NG V?? V??I TR???N THUA M?? ???? V???I QUAY L??NG, C??I ?????U",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/D3_U-iBiR28?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                3153,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "NEXT SPORTS | PARK HANG SEO - V??? THUY???N TR?????NG V?? ?????I C???A B??VN, ?????NG V?? V??I TR???N THUA M?? ???? V???I QUAY L??NG, C??I ?????U\n" +
                        "<br/> \n" +
                        "??? K??nh Youtube ch??nh th???c, ????ng k?? ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - ?????ng h??nh c??ng th??? thao Vi???t Nam tr??n m???i ch???ng ???????ng!",
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
                "C???N C???NH BU???I T???P CHI???U 29/10 ??T VI???T NAM I MINH V????NG T???P RI??NG, C??NG PH?????NG T???M M??A S???P C?? T??C M???I",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/4mMVpgMgMF8?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                7351,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "",
                "NEXT SPORTS | C???N C???NH BU???I T???P NG??Y 29/10 C???A ??T VI???T NAM | \n" +
                        "C???N C???NH BU???I T???P CHI???U 29/10 ??TVN I MINH V????NG T???P RI??NG, C??NG PH?????NG T???M M??A S???P C?? T??C M???I\n" +
                        "??? K??nh Youtube ch??nh th???c, ????ng k?? ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - ?????ng h??nh c??ng th??? thao Vi???t Nam tr??n m???i ch???ng ???????ng!",
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
                "H??NH TR??NH L???CH S??? U23 VI???T NAM VCK U23 CH??U ?? I NH???NG SI??U PH???M PH??T CU???I V?? LO???T PENALTY ?????NH M???NH",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Z4K78CKKmxo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                6868,
                Timestamp.valueOf("2021-04-22 20:00:00.00"),
                "",
                "NEXT SPORTS | H??NH TR??NH L???CH S??? U23 VI???T NAM VCK U23 CH??U ?? I NH???NG SI??U PH???M PH??T CU???I V?? LO???T PENALTY ?????NH M???NH\n" +
                        "<br/> \n" +
                        "??? K??nh Youtube ch??nh th???c, ????ng k?? ngay: https://bit.ly/Nextsports\n" +
                        "<br/> \n" +
                        "Next Sports - ?????ng h??nh c??ng th??? thao Vi???t Nam tr??n m???i ch???ng ???????ng!",
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
                        "Visit and subscribe to our 'BT Sport Boxing' YouTube channel ?????? https://www.youtube.com/c/btsportboxing\n" +
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
                "D??? b??o th???i ti???t h??m nay m???i nh???t ng??y 13/11/2021 | D??? b??o th???i ti???t 3 ng??y t???i",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/e3uTbGN4-MM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                2796,
                Timestamp.valueOf("2021-04-01 20:00:00.00"),
                "#thoitiet #tintuc",
                "D??? b??o th???i ti???t h??m nay m???i nh???t ng??y 13/11/2021 | D??? b??o th???i ti???t 3 ng??y t???i | Truy???n H??nh Nh??n D??n\n" +
                        "Website: https://nhandantv.vn\n" +
                        "Xem Tin T???c h???p d???n, T???ng H???p Video M???i nh???t v??? #thoitiet - Tin Th??? Gi???i m???i nh???t ??ang di???n ra trong th???i gian qua tr??n k??nh truy???n h??nh nh??n d??n - K??nh Tin B??o Nh??n D??n s??? c???p nh???t ?????n c??c b???n c??c th??ng tin ?????y ????? nh???t t???i ????y. M???i b???n ????n xem nh?? !\n" +
                        "????ng K?? Xem Video #tintuc Mi???n Ph??: http://goo.gl/dVkSzA\n" +
                        "1. D??? B??o Th???i Ti???t H??m Nay : https://bit.ly/2sNoeGo\n" +
                        "2. B???n Tin S??ng : https://bit.ly/2tAM882\n" +
                        "3. B???n Tin Tr??a : https://bit.ly/2N2HHJJ\n" +
                        "4. B???n Tin T???i : https://bit.ly/35yEjwX",
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
                "Ukraine ????a 8.500 l??nh v?? c???nh s??t ?????n bi??n gi???i v???i Belarus ????? ng??n ng?????i di c?? v?????t bi??n | VTC Now",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/B51QtrdnwMI\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                80956,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#vtcnow",
                "VTC Now | Ng??y 11/11, B??? tr?????ng N???i v??? Ukraine Denys Monastyrskiy cho bi???t qu???c gia c???a ??ng s??? tri???n khai th??m 8.500 binh s?? v?? s?? quan c???nh s??t, c??ng 15 m??y bay tr???c th??ng ????? b???o v??? bi??n gi???i v???i Belarus, ng??n ch???n nguy c?? ng?????i di c?? mu???n v?????t bi??n.\n" +
                        "<br/> \n" +
                        "(*) T???i ???ng d???ng tr??n App Store: https://apple.co/3CcvARH\n" +
                        "<br/> \n" +
                        "(*) T???i ???ng d???ng tr??n CH Play: https://bit.ly/3tFibhQ\n" +
                        "<br/> \n" +
                        "(*) Theo d??i th??m t???i www.vtc.gov.vn",
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
                "To??n c???nh ??T Vi???t Nam vs ??T Nh???t B???n sau tr???n ?????u:M???c d?? thua v???n ???????c th?????ng l??n t???i 500 tri???u ?????ng",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/HUdmaSTPED4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                36367,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#tintuc24hol #tintuc",
                "#tintuc24hol #tintuc  \n" +
                        "D?? ch??i ?????y n??? l???c, t???o ra m???t th??? tr???n kh?? ???n t?????ng, ??T Vi???t Nam v???n kh??ng th??? tr??nh kh???i th???t b???i v???i t??? s??? 0-1 tr?????c ?????i b??ng h??ng ?????u ch??u ?? ??? Nh???t B???n t???i ng??y 11/11 t???i M??? ????nh. ????y c??ng l?? th???t b???i th??? 5 li??n ti???p c???a ??T Vi???t Nam t???i v??ng lo???i th??? 3 World Cup 2022. Nh??ng sau nh???ng g?? ???? th??? hi???n trong su???t 90 ph??t tr???n ?????u, c??c h???c tr?? HLV Park Hang Seo v???n x???ng ????ng ???????c d??nh nh???ng l???i ng???i khen.\n" +
                        "Th?????ng tr???c Ban ch???p h??nh Li??n ??o??n B??ng ???? Vi???t Nam (VFF) ????nh gi?? Quang H???i v?? ?????ng ?????i ???? c?? tr???n ?????u n??? l???c v?????t b???c v?? khen ng???i tinh th???n c???a ?????i b??ng ??o ?????. L??nh ?????o VFF quy???t ?????nh th?????ng ?????ng vi??n cho to??n ?????i 500 tri???u ?????ng v?? nh???c nh??? c??c c???u th??? ti???p t???c t???p trung, chu???n b??? t???t nh???t cho tr???n ti???p Saudi Arabia v??o t???i 16/11.\n" +
                        "Ph??t bi???u sau tr???n ?????u, HLV Park Hang Seo chia s???: ??????N??ng l???c c?? nh??n gi???a Nh???t B???n v?? Vi???t Nam c?? kho???ng c??ch. C??c c???u th??? Vi???t Nam c??ng ???? n??? l???c h???t s???c r???i. C?? m???t v???n ????? th??? n??y, Vi???t Nam ???? thua 5 tr???n ??? v??ng lo???i th??? 3 World Cup 2022. Vi???c c??c c???u th??? c??ng nh?? Ban hu???n luy???n b??? stress v?? k???t qu??? kh??ng t???t l?? s??? th???t. Su???t cu???c ?????i l??m b??ng ????, t??i m???i hi???u ki???m 1 ??i???m l???i kh?? ?????n th??? n??o. Vi???c Vi???t Nam v??o v??ng lo???i th??? 3 c??ng cho th???y r???ng nhi???u ?????i tuy???n m???nh h??n Vi???t Nam th???t???.\n" +
                        "Sau tr???n ?????u v???i Nh???t B???n, ??T Vi???t Nam s??? c?? 4 ng??y ????? chu???n b??? cho cu???c ti???p ????n Saudi Arabia, ?????i b??ng ??ang b???t b???i v?? hi???n ?????ng ?????u b???ng B sau 5 l?????t tr???n. Tr???n ?????u s??? di???n ra v??o 19h00 ng??y 16/11 t???i s??n M??? ????nh. \n" +
                        "??? TIN T???C 24H ONLINE l?? k??nh Youtube chia s??? c??c n???i dung tin t???c, b???n tin c???p nh???t 24h online, nh???ng n???i dung gi???i tr?? h???p d???n ???????c ph??t s??ng tr??n c??c k??nh ch????ng tr??nh ????i truy???n h??nh, c??c tin t???c c???p nh???t, ch????ng tr??nh truy???n h??nh tr???c ti???p, ch????ng tr??nh th??? thao, b??ng ????, gi???i tr??, game show, showbiz??? V???i mong mu???n c???p nh???t nh???ng th??ng tin ch??nh x??c v?? nhanh nh???t tr??n n???n t???ng s??? cho qu?? v??? v?? c??c b???n.\n" +
                        " \n" +
                        "?????????????????? C???m ??n c??c b???n ???? xem video! C??c b???n ?????ng qu??n nh???n v??o ??? ????ng K?? K??nh v?? bi???u t?????ng \uD83D\uDD14 ph??a d?????i g??c ph???i c???a video ????? kh??ng b??? l??? nh???ng video m???i nh???t nh?? ??????????????????\n" +
                        "<br/> \n" +
                        "??? ????NG K?? K??NH (mi???n ph??) T???I ????Y: http://bit.ly/2n4bWWO\n" +
                        "<br/> \n" +
                        "??? Xem nh???ng Clip m???i v?? h???p d???n nh???t: \n" +
                        "- Th??? thao: http://bit.ly/2n3dyQt \n" +
                        "- An ninh ng??y m???i h??m nay: http://bit.ly/2n6yKoT \n" +
                        "- Tin t???c m???i nh???t 24h h??m nay: http://bit.ly/2n197pi \n" +
                        "- Tin t???c C??ng ngh??? t???ng h???p: http://bit.ly/2l24YAY \n" +
                        "- B???n tin th???i s??? T???ng h???p h??ng ng??y: http://bit.ly/2l3JRyg \n" +
                        "- V??ng lo???i World Cup 2020 ?????i tuy???n Vi???t Nam t???ng h???p: http://bit.ly/2n1ddOc \n" +
                        "<br/> \n" +
                        "??? Theo d??i K??nh TIN T???C 24H ONLINE  tr??n: \n" +
                        "- Facebook : https://www.facebook.com/tt24hol/ \n" +
                        "- Twitter: https://twitter.com/tt24hol \n" +
                        "<br/> \n" +
                        "??? Fair use for news reporting (https://www.youtube.com/yt/copyright/...) and (https://en.wikipedia.org/wiki/Fair_use) \n" +
                        "<br/> \n" +
                        "??? M???i v???n ????? v??? video vi ph???m B???n quy???n (https://www.youtube.com/yt/copyright/), Ch??nh s??ch (https://www.youtube.com/t/terms), \n" +
                        "- Nguy??n t???c c???ng ?????ng (http://www.youtube.com/yt/policyandsa...) ch??ng t??i s??? x??a ch??ng, xin li??n h??? tr???c ti???p qua email: now.tintuc@gmail.com . If there are any copyright issues with any videos posted here We will remove them, please contact our email: now.tintuc@gmail.com",
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
                "Ch??? T???ch H. C?? T?? B??? T??? D???t C??n B??? V??n H??a V??o Kh??ch S???n, C??ng An L???p T???c Tr??ch Xu???t Camera? | SK??S",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Ml9UaQFXpqE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                3535,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#Share #quangninh #dinhchibithucoto",
                "SK??S | Li??n quan ?????n v??? vi???c B?? Th?? - Ch??? t???ch Huy???n C?? T??, Qu???ng Ninh b??? ????nh ch??? c??ng t??c. M???i ????y, c?? quan c???nh s??t ??i???u tra ???? v??o cu???c x??c minh v?? l???p t???c tr??ch xu???t Camera kh??ch s???n - n??i x???y ra v??? vi???c. V???y c??? th??? h??nh vi ???? nh?? th??? n??o? Tr??ch xu???t camera c?? g?? trong ????? M???i qu?? v??? v?? c??c b???n c??ng theo d??i ngay sau ????y.\n" +
                        "<br/> \n" +
                        "M???i qu?? v??? v?? c??c b???n xem th??m: Ho??n Nguy??n - T???nh Th???t B???ng Lai: 'Ch??a T???ng K??u G???i T??? Thi???n, Ai Th????ng Th?? Ng?????i Ta Cho' https://youtu.be/yvzfUrtVA20?t=53\n" +
                        "<br/> \n" +
                        "\uD83D\uDD06N??t #Share c???a b???n gi??? ????y r???t h???u ??ch \n" +
                        "--------------------\n" +
                        "\uD83D\uDC4DB??o S???c kh???e v?? ?????i s???ng ??? C?? quan ng??n lu???n c???a B??? Y t???\n" +
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
                "T???i 12-11: C??? n?????c ghi nh???n 8.976 ca m???i, TP.HCM t??ng 203 ca",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/pULS-_wFTbo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                83016,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#TinNong #Tin_N??ng #COVID19",
                "T??nh t??? 16h ng??y 11/11 ?????n 16h ng??y 12/11, tr??n H??? th???ng Qu???c gia qu???n l?? ca b???nh COVID-19 ghi nh???n 8.982 ca nhi???m m???i, trong ???? 6 ca nh???p c???nh v?? 8.976 ca ghi nh???n trong n?????c (t??ng 831 ca so v???i h??m qua)\n" +
                        "<br/> \n" +
                        "#TinNong #Tin_N??ng #COVID19\n" +
                        "<br/> \n" +
                        "K??nh th??ng tin ch??nh th???c v?? duy nh???t c???a #B??o_Tu???i_Tr??? tr??n YouTube.\n" +
                        " \n" +
                        "Tin t???c nhanh nh???t, m???i nh???t, n??ng nh???t ??ang di???n ra ??? Vi???t Nam v?? th??? gi???i v???: th???i s???, kinh t???, ch??nh tr???, x?? h???i, gi??o d???c, th??? thao, v??n h??a, gi???i tr??, c??ng ngh???, nh???p s???ng s???, ph??p lu???t, du l???ch...\n" +
                        "<br/> \n" +
                        "#TuoiTre #BaoTuoiTre #TinNong #Th???i_S??? #ThoiSu #Tu???i_Tr??? \n" +
                        "<br/> \n" +
                        "-----------\n" +
                        "????ng k?? k??nh xem th??m nhi???u chuy??n m???c h???p d???n kh??c:\n" +
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
                        "B???n quy???n n???i dung thu???c v??? b??o Tu???i Tr???.\n" +
                        "--------------------\n" +
                        "T??A SO???N B??O TU???I TR???\n" +
                        "- ?????a ch???: S??? 60A, Ho??ng V??n Th???, Ph?????ng.9, Qu???n Ph?? Nhu???n, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam\n" +
                        "- ??i???n tho???i: (84.8) 3.997.3838\n" +
                        "- Website: http://tuoitre.vn\n" +
                        "- Email: tto@tuoitre.com.vn\n" +
                        "- ???????ng d??y n??ng: 0918.033.133 - (84.8) 39.971.010",
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
                "Hi???n tr?????ng v??? s???t l??? 7 c??n nh?? ??? ?????u ???????ng Khe Sanh, TP ???? L???t",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/tNu-JnVQoHk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                11601,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#TinNong #Tin_N??ng #S???t_L???",
                "Chi???u 12-11, m???t v??? s???t l??? x???y ra ??? ?????u ???????ng Khe Sanh, thu???c ph?????ng 10, TP ???? L???t, t???nh L??m ?????ng - l??m ???nh h?????ng ?????n 7 c??n nh??, trong ???? c?? 1 c??n b??? tr??i ho??n to??n xu???ng ph??a b??n d?????i.\n" +
                        "<br/> \n" +
                        "#TinNong #Tin_N??ng #S???t_L???\n" +
                        "<br/> \n" +
                        "K??nh th??ng tin ch??nh th???c v?? duy nh???t c???a #B??o_Tu???i_Tr??? tr??n YouTube.\n" +
                        " \n" +
                        "Tin t???c nhanh nh???t, m???i nh???t, n??ng nh???t ??ang di???n ra ??? Vi???t Nam v?? th??? gi???i v???: th???i s???, kinh t???, ch??nh tr???, x?? h???i, gi??o d???c, th??? thao, v??n h??a, gi???i tr??, c??ng ngh???, nh???p s???ng s???, ph??p lu???t, du l???ch...\n" +
                        "<br/> \n" +
                        "#TuoiTre #BaoTuoiTre #TinNong #Th???i_S??? #ThoiSu #Tu???i_Tr??? ",
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
                "Th??? t?????ng Ph???m Minh Ch??nh: Ph??n b??? vaccine v???n ch??a c??ng b???ng l???m",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/N-3_5XC860A\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                82490,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#vtcnow",
                "VTC Now | S??ng 12/11, tr??? l???i ch???t v???n v??? v???n ????? ?????m b???o s??? c??ng b???ng, quy???n ???????c ti??m 2 m??i vaccine cho m???i ?????a ph????ng tr??n c??? n?????c, Th??? t?????ng pH???m Minh Ch??nh cho bi???, th???i gian qua ph??n b??? vaccine v???n ch??a c??ng b???ng do ph???i t???p trung cho c??c ?????a ph????ng c?? d???ch. \n" +
                        "<br/> \n" +
                        "(*) T???i ???ng d???ng tr??n App Store: https://apple.co/3CcvARH\n" +
                        "<br/> \n" +
                        "(*) T???i ???ng d???ng tr??n CH Play: https://bit.ly/3tFibhQ\n" +
                        "<br/> \n" +
                        "(*) Theo d??i th??m t???i www.vtc.gov.vn",
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
                "Tin Bi???n ????ng m???i nh???t 6/11. Anh tuy??n b??? s???c n???u m??y bay c???a Trung Qu???c xu???t k??ch tr??n Bi???n ????ng",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/oJKTOBb37zE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                236600,
                Timestamp.valueOf("2021-11-6 20:00:00.00"),
                "#tintuc24hol #tintuc",
                "Th??a qu?? v??? v?? c??c b???n, m???c d?? kh??ng c?? quy???n l???i tr???c ti???p ??? Bi???n ????ng nh??ng Anh nhi???u l???n tuy??n b??? kh??ng ch???p nh???n b???t k??? qu???c gia n??o tr??n th??? gi???i ngang t??ng b???t ch???p lu???t bi???n. M???i ????y nh???t, Anh ???? theo d??i c??c t??u ng???m c???a Trung Qu???c t??? t??u s??n bay v?? s???n s??ng ????nh ch???n c??c m??y bay ph???n l???c c???a B???c Kinh ??? Bi???n ????ng n???u c?? ch??? ?????o.\n" +
                        "<br/> \n" +
                        "??? TIN T???C 24H ONLINE l?? k??nh Youtube chia s??? c??c n???i dung tin t???c, b???n tin c???p nh???t 24h online, nh???ng n???i dung gi???i tr?? h???p d???n ???????c ph??t s??ng tr??n c??c k??nh ch????ng tr??nh ????i truy???n h??nh, c??c tin t???c c???p nh???t, ch????ng tr??nh truy???n h??nh tr???c ti???p, ch????ng tr??nh th??? thao, b??ng ????, gi???i tr??, game show, showbiz??? V???i mong mu???n c???p nh???t nh???ng th??ng tin ch??nh x??c v?? nhanh nh???t tr??n n???n t???ng s??? cho qu?? v??? v?? c??c b???n.\n" +
                        " \n" +
                        "?????????????????? C???m ??n c??c b???n ???? xem video! C??c b???n ?????ng qu??n nh???n v??o ??? ????ng K?? K??nh v?? bi???u t?????ng \uD83D\uDD14 ph??a d?????i g??c ph???i c???a video ????? kh??ng b??? l??? nh???ng video m???i nh???t nh?? ??????????????????\n" +
                        "<br/> \n" +
                        "??? ????NG K?? K??NH (mi???n ph??) T???I ????Y: http://bit.ly/2n4bWWO\n" +
                        "<br/> \n" +
                        "??? Xem nh???ng Clip m???i v?? h???p d???n nh???t: \n" +
                        "- Th??? thao: http://bit.ly/2n3dyQt \n" +
                        "- An ninh ng??y m???i h??m nay: http://bit.ly/2n6yKoT \n" +
                        "- Tin t???c m???i nh???t 24h h??m nay: http://bit.ly/2n197pi \n" +
                        "- Tin t???c C??ng ngh??? t???ng h???p: http://bit.ly/2l24YAY \n" +
                        "- B???n tin th???i s??? T???ng h???p h??ng ng??y: http://bit.ly/2l3JRyg \n" +
                        "- V??ng lo???i World Cup 2020 ?????i tuy???n Vi???t Nam t???ng h???p: http://bit.ly/2n1ddOc \n" +
                        "<br/> \n" +
                        "??? Theo d??i K??nh TIN T???C 24H ONLINE  tr??n: \n" +
                        "- Facebook : https://www.facebook.com/tt24hol/ \n" +
                        "- Twitter: https://twitter.com/tt24hol \n" +
                        "<br/> \n" +
                        "??? Fair use for news reporting (https://www.youtube.com/yt/copyright/...) and (https://en.wikipedia.org/wiki/Fair_use) \n" +
                        "<br/> \n" +
                        "??? M???i v???n ????? v??? video vi ph???m B???n quy???n (https://www.youtube.com/yt/copyright/), Ch??nh s??ch (https://www.youtube.com/t/terms), \n" +
                        "- Nguy??n t???c c???ng ?????ng (http://www.youtube.com/yt/policyandsa...) ch??ng t??i s??? x??a ch??ng, xin li??n h??? tr???c ti???p qua email: now.tintuc@gmail.com . If there are any copyright issues with any videos posted here We will remove them, please contact our email: now.tintuc@gmail.com",
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
                "Nh?? Ti??n Tri Nostradamus V?? Nh???ng Ti??n ??o??n V??? Th???m K???ch S???p X???y Ra V??o Th??ng 11/2021 | TGN",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/U4slniRnuN8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1260901,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#th???gi???inghi??ng #tgn #nh??ti??ntriNostradamus",
                "TH??? GI???I NGHI??NG | M???i ????y, sau nh???ng g?? Virus corona ch???ng m???i c?? ngu???n g???c t??? V?? H??n, Trung Qu???c g??y ra, ng?????i ta l???i ?????t ra c??u h???i v??? nh???ng ti??n tri c???a Nostradamus c???nh b??o t??? 500 n??m tr?????c. Li???u c?? ph???i d???ch b???nh do virus corona g??y ra hi???n nay ???? ???????c nh?? ti??n tri thi??n t??i Nostradamus ti??n tri tr?????c ????, th???m k???ch n??o s???p x???y ra v??o th??ng 11/2021, ngay sau ????y h??y c??ng Th??? Gi???i Nghi??ng gi???i m??.\n" +
                        "<br/> \n" +
                        "M???i qu?? v??? v?? c??c b???n xem th??m:  Th???c H?? V???c ???Xin Trung Qu???c V?? Ch???t L?????ng Ng???a Covid-19 To??n C???u?: https://youtu.be/Y6_upDu13DI\n" +
                        "????????? XEM TH??M ?????????\n" +
                        "??? TIN TH??? GI???I M???I NH???T: https://bit.ly/TINTHEGIOIMOINHAT\n" +
                        "??? D???ch Covid-19 t???i ???n ?????: https://bit.ly/DichCovidAnDo \n" +
                        "??? Tin T???c Bi???n ????ng M???i Nh???t: https://bit.ly/TinTucBienDongMoiNhat \n" +
                        "??? H??nh tr??nh ph?? ??n m???i nh???t: https://bit.ly/HanhTrinhPhaAnHayNhat\n" +
                        "<br/> \n" +
                        "K??nh Th??? Gi???i Nghi??ng - TGN l?? k??nh t???ng h???p tin t???c, th???i s??? Vi???t Nam v?? th??? gi???i, c???p nh???t nh???ng tin t???c v?? di???n bi???n m???i nh???t v??? t??nh h??nh qu??n s???, an ninh, ch??nh tr???, kinh t??? v?? v??n h??a qu???c t???, ?????c bi???t l?? v??? t??nh h??nh Bi???n ????ng, M??? - Trung Qu???c, c??ng c??c ph??n t??ch, b??nh lu???n c???a c??c chuy??n gia, h???c gi??? trong n?????c v?? qu???c t???. \n" +
                        "C???m ??n c??c b???n ???? xem video! H??y ????ng k?? k??nh ????? c???p nh???t th??ng tin m???i h???u ??ch nh???t!\n" +
                        "<br/> \n" +
                        "????????? ????NG K?? K??NH ????????? \n" +
                        "??? Th??? Gi???i Nghi??ng: http://bit.ly/TheGioiNghiengSubscribe\n" +
                        "??? Tin T???c Vi???t Nam : http://bit.ly/TinTucVietNamSubscribe\n" +
                        "??? K??nh ???????c v???n h??nh b???i 5G Network \n" +
                        "??? M???i v???n ????? b???n quy???n xin li??n h???: copyright@5gmedia.vn",
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
                "Tin th??? gi???i m???i nh???t 28/10 | M??? - Trung kh???u chi???n gay g???t v??? v???n ????? ????i Loan | FBNC",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/12nHX2YKV2U\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                310395,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#tintucfbnc #tinthegioi #tinthegioimoinhat",
                "Tin th??? gi???i m???i nh???t 28/10 | M??? - Trung kh???u chi???n gay g???t v??? v???n ????? ????i Loan\n" +
                        "TRUNG QU???C- NGA V???A R???I ??I, M??? - NH???T ???? R???M R??? T???P TR???N CHUNG TR??N BI???N ????NG\n" +
                        "??M CH??? TRUNG QU???C, NH???T B???N TUY??N B??? PH???N ?????I M???NH M??? NH???NG TH??CH TH???C TR???T T??? H??NG H???I \n" +
                        "TRUNG QU???C TUY??N B??? S??? C??NG ASEAN NGHI??N C???U C??C L??NH V???C M???I CHO TH???A THU???N TH????NG M???I T??? DO\n" +
                        "PH???T L??? C???NH C??O C???A TRUNG QU???C, PH??I ??O??N NGH??? VI???N CH??U ??U V???N S??? ?????N TH??M ????I LOAN \n" +
                        "TRUNG QU???C KI??N QUY???T PH???N ?????I S??? ???NG H??? ????I LOAN GIA NH???P LHQ C???A M???\n" +
                        "C???N C???NH ???KHUNG X????NG NG?????I S???T??? M???I C???A QU??N ?????I ????I LOAN \n" +
                        "TRUNG QU???C: C??C B??C S??? ??? T??N C????NG G???I TIN ?????N TRI???T S???N PH??? N??? L?? ???HO??N TO??N V?? C??N C??????\n" +
                        "WTO ?????NG ?? ??I???U TRA M???C THU??? C???A TRUNG QU???C TRONG TRANH CH???P R?????U VANG V???I ??C\n" +
                        "K??? HO???CH ????NH THU??? BDS C???A TRUNG QU???C S??? B??? TR?? HO??N V?? C?? TH??? ????????NG??? ?????N GI???I CH??NH TR????\n" +
                        "NGA L??NG S???C C?????P BI???N TR??N T??U H??NG GAY C???N NH?? PHIM H??NH ?????NG\n" +
                        "M??? XEM X??T ????A ISRAEL, ROMANIA V?? BULGARIA V??O CH????NG TR??NH MI???N TH??? TH???C\n" +
                        "N??? HO??NG ANH ELIZABETH II KH??NG D??? H???I NGH??? COP26\n" +
                        "QU?? III/2021, L???I NHU???N C??NG TY M??? C???A GOOGLE T??NG V???T\n" +
                        "??NG JACK MA ??ANG TH??M NHI???U ?????A ??I???M ??? H?? LAN\n" +
                        "T???NG TH???NG M??? ?????N VATICAN, H???I ????M V???I GI??O HO??NG FRANCIS\n" +
                        "?????M NG?????C 100 NG??Y, OLYMPIC B???C KINH 2022 ?????I M???T V???I NGUY C?? L???N T??? COVID-19\n" +
                        "CANADA RA M???T ?????NG PH???C OLYMPIC M??A ????NG B???C KINH 2022\n" +
                        "CH??NH TH???C: C??C TAY V???T CH??A TI??M PH??NG COVID-19 V???N ???????C THAM GIA GI???I ??C M??? R???NG 2022\n" +
                        "H??NG NG??N NG?????I NICARAGUA ?????N HONDURAS ????? TI??M CH???NG\n" +
                        "PERU N??? L???C B???O T???N L???C ???? VICUNA\n" +
                        "NASA PH??T HI???N D???U HI???U V??? H??NH TINH ?????U TI??N B??N NGO??I D???I NG??N H??\n" +
                        "--------------------\n" +
                        "FBNC (Financial Business News Channel) l?? k??nh tin t???c chuy??n v??? kinh t??? - T??i ch??nh, b???t ?????ng s???n, ch???ng kho??n - c??? phi???u, c???p nh???t gi?? v??ng , tin th??? gi???i, tin t???c 24h,??? V???i mong mu???n c???p nh???t nh???ng th??ng tin ch??nh x??c v?? nhanh nh???t cho qu?? v??? v?? c??c b???n.!\n" +
                        "- ????ng k?? k??nh ????? theo d??i tin t???c m???i nh???t: http://popsww.com/FBNC\n" +
                        "- FBNC Gi???i Tr??: https://www.youtube.com/channel/UCuaJ...\n" +
                        "K??nh truy???n th??ng FBNC:\n" +
                        "- Fanpage: https://www.facebook.com/kinhtetaichi...\n" +
                        "- Group th???o lu???n, tin n??ng: https://www.facebook.com/groups/11262...\n" +
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
                "L???c V??o Th??? Gi???i Game \"Nh??ng C?? N???p L???n ?????u\" \uD83D\uDE08\uD83E\uDD75 | T???p L??m Anime | T??m T???t Anime Hay",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/UqNw2CrRCPQ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                783102,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#anime",
                "T??m T???t Anime Hay :\n" +
                        "??? T??n Anime : Infinite Dendrogam\n" +
                        "\uD83C\uDF38 Like videos v?? subscribes cho T???p L??m Anime n???u b???n th???y th??ch nh??.\n" +
                        "???????????????????????????????????????????????????????????????????????????\n" +
                        "??? Music in video :\n" +
                        "??? Track:  NEFFEX - Till I Let Go [Copyright Free]\n" +
                        "??? Music provided by NEFFEX\n" +
                        "??? Watch: https://www.youtube.com/watch?v=8bblU...\n" +
                        "??? Music in video : NEFFEX - Till I Let Go [Copyright Free]\n" +
                        "??? Track:  NEFFEX - FOYF [Copyright Free]\n" +
                        "??? Music provided by NEFFEX\n" +
                        "??? Watch: https://www.youtube.com/watch?v=yTz_M...\n" +
                        "??? Music in video : \n" +
                        "??? Track: NEFFEX - SOMETHING YOU COULD NEVER OWN [Copyright Free]\n" +
                        "??? Music provided by NEFFEX\n" +
                        "??? Watch: https://www.youtube.com/watch?v=CO1QE...\n" +
                        "??? Music in video : \n" +
                        "??? Track: NEFFEX - INSPIRED [Copyright Free]\n" +
                        "??? Music provided by NEFFEX\n" +
                        "??? Watch: https://www.youtube.com/watch?v=cjny7...\n" +
                        "??? Music in video :\n" +
                        "??? Track:  NEFFEX - IT'S ONLY WORTH IT IF YOU WORK FOR IT [Copyright Free]\n" +
                        "??? Music provided by NEFFEX\n" +
                        "??? Watch: https://www.youtube.com/watch?v=QNZy8...\n" +
                        "??? Music in video :\n" +
                        "??? Track:  NEFFEX - A YEAR AGO [Copyright Free]\n" +
                        "??? Music provided by NEFFEX\n" +
                        "??? Watch: https://www.youtube.com/watch?v=9_va5...\n" +
                        "???????????????????????????????????????????????????????????????????????????\n" +
                        "??? T??? kh??a :\n" +
                        "???Review phim\n" +
                        "???Review ho???t h??nh\n" +
                        "???Main b??\n" +
                        "???H??nh ?????ng\n" +
                        "???Shounen\n" +
                        "???Si??u Nhi??n \n" +
                        "????????i Th?????ng\n" +
                        "???Fantasy\n" +
                        "???Si??u Nhi??n\n" +
                        "???H??i H?????c \n" +
                        "???Ph??p Thu???t \n" +
                        "???Harem\n" +
                        "???H???c ???????ng\n" +
                        "???Vi???n T?????ng\n" +
                        "???????????????????????????????????????????????????????????????????????????\n" +
                        "??? M???i v???n ????? v??? vi ph???m ch??nh s??ch , lu???t b???n quy???n hay nguy??n t???c c???ng ?????ng , xin h??y li??n h??? t??i t???i\n" +
                        "??? Trantqkhai@gmail.com\n" +
                        "???????????????????????????????????????????????????????????????????????????\n" +
                        "??? All Music , Pictures, Videos and Sounds That Appear In This Video Are Owned By Their Respective Owners\n" +
                        "??? Copyright Disclaimer, Under Section 107 of the Copyright Act 1976, allowance is made for 'fair use' for purposes such as criticism, comment, news reporting, teaching, scholarship, and research. Fair use is a use permitted by copyright statute that might otherwise be infringing. Non-profit, educational or personal use tips the balance in favor of fair use.\n" +
                        "???????????????????????????????????????????????????????????????????????????\n" +
                        "??? C???m ??n C??c B???n ???? Xem Video C???a M??nh ???(???*???????)???* ?????????????????",
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
                "[Review Phim] Vi??n ???? B?? T???o Khi???n H??nh Tinh Bay M??u Trong 1 N???t Nh???c | Men In Black",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/g3i8LmsXMUU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                554785,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#reviewphim #netflix #meninblack #phimkinhdi #tomtatphim #phimhai #willsmith",
                "T??m T???t Phim Vi???n T?????ng Si??u H??i H?????c | Review Phim ?????c V??? ??o ??en 4.\n" +
                        "<br/> \n" +
                        "?????c V??? ??o ??en Ph???n 4 (Men in Black 4) l?? m???t b??? phim h??nh ?????ng khoa h???c vi???n t?????ng theo truy???n tranh 3D c???a M??? 2019 do F. Gary Gray ?????o di???n v?? c?? s??? tham gia d??n di???n vi??n kh??ng xu???t hi???n 3 ph???n tr?????c: Chris Hemsworth, Tessa Thompson v?? Liam Neeson.\n" +
                        "B???y l??u nay, ?????c v??? ??o ??en lu??n l?? nh???ng ng?????i h??ng th???m l???ng ???ng???u??? nh???t, b???o v??? Tr??i ?????t kh???i nh???ng hi???m h???a x???u xa ngo??i h??nh tinh. Trong cu???c phi??u l??u m???i n??y, h??? ph???i ?????i m???t v???i m???i ??e d???a mang t??nh to??n c???u l???n nh???t t??? tr?????c ?????n gi???: truy t??m ??i???p vi??n hai mang ???n m??nh trong t??? ch???c Men In Black. ",
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
                "H???u Du??? Cu???i C??ng C???a T???c R???ng Kh???ng L??? | Review Phim | T??m T???t Phim\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/--H8KhqpzM0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1133305,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#reviewphim #phimreview #tomtatphim",
                "H???u Du??? Cu???i C??ng C???a T???c R???ng Kh???ng L??? | Review Phim | T??m T???t Phim\n" +
                        "#reviewphim #phimreview #tomtatphim\n" +
                        "????y l?? video t??m t???t n???i dung phim",
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
                "Cu???c ?????i ?????u V???i ?????i Qu??n C??n Tr??ng Kh???ng L??? | Review Phim | T??m T???t Phim\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/m0uGZtkaFvU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                251519,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#reviewphim #phimreview #tomtatphim",
                "Cu???c ?????i ?????u V???i ?????i Qu??n C??n Tr??ng Kh???ng L??? | Review Phim | T??m T???t Phim\n" +
                        "#reviewphim #phimreview #tomtatphim\n" +
                        "????y l?? video t??m t???t n???i dung phim",
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
                "[Review] TOP s???n ph???m l??m ?????p N???I ?????A TRUNG SI??U R??? HOT V?? ?????I tr??n SHOPEE CH??? T??? 1K!",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/92M7oMHuyds\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                632248,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#NoCopyright #CopyrightFree #1HMNCNoCopyrightMusic",
                "Review] TOP s???n ph???m l??m ?????p N???I ?????A TRUNG SI??U R??? HOT V?? ?????I tr??n SHOPEE CH??? T??? 1K!\n" +
                        "<br/> \n" +
                        "Link s???n ph???m trong video\n" +
                        "<br/> \n" +
                        "1. M???t n??? gi???y d?????ng tr???ng da m???n c???p ???m th???i ?????c HA Images\n" +
                        "https://shp.ee/u5vtwj3\n" +
                        "2.  M???t n??? d?????ng m??i collagen n???i ?????a trung biaqua,images gi???m th??m m??i l??m m???m m??i\n" +
                        "https://shp.ee/gxn6qc3\n" +
                        "3. M???t N??? D?????ng ???m D?????ng Tr???ng Da HA Maycreate Mask \n" +
                        "https://shp.ee/kpwjkx3\n" +
                        "4. M???t n??? m???t Images 80g (60 c??i)\n" +
                        "https://shp.ee/4gvspu3\n" +
                        "5. B??? 60 Mi???ng M???t N??? Lanbena \n" +
                        "https://shp.ee/pqv3yt3\n" +
                        "6. C??? R???a M???t GDTIMA H??nh B???ch Tu???c ?????c ????o Ch???t L?????ng Cao 20g\n" +
                        "https://shp.ee/j836wqj\n" +
                        "7. B??ng T???y Trang Cotton Pads 3 L???p T??i 222 Mi???ng\n" +
                        "https://shp.ee/8bj7x3j\n" +
                        "8. B??ng t???y trang Laneila \n" +
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
                "[Review] Kem ch???ng n???ng Hemia, ??? nh??? n???ng Y???n t????i Queen Perfect, Kem body | U l?? tr???i !!!\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/XZZ65Ny4XKo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                97299,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#HALINH #HEMIA #QUEENPERFECT",
                "[Review] Kem ch???ng n???ng Hemia, ??? nh??? n???ng Y???n t????i Queen Perfect, Kem body | U l?? tr???i!\n" +
                        "<br/> \n" +
                        "??? Connect with me: \n" +
                        "???Youtube: https://bit.ly/2mzuNZY\n" +
                        "???Page: https://www.facebook.com/vohalinh.bee\n" +
                        "???Facebook : https://www.facebook.com/halinh.bee\n" +
                        "???Instagram: https://www.instagram.com/vth.linh\n" +
                        "???Email: vhlinh.1211@gmail.com\n" +
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
                "10 smartphone D?????I 5 TRI???U h???c online T???T NH???T 2021: M??n ?????p, pin tr??u, loa t???t, b???o h??nh ?????Y ?????!\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Pu8M2sYa5jw\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                103114,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#Xiaomi #Realme #Vsmart",
                "10 smartphone D?????I 5 TRI???U h???c online T???T NH???T 2021: M??n ?????p, pin tr??u, loa t???t, b???o h??nh ?????Y ?????!\n" +
                        "?????t tr?????c iPhone 13 series t???i Di ?????ng Vi???t:\n" +
                        "\uD83D\uDD17 https://didongviet.vn/iphone-13\n" +
                        "?????t h??ng Samsung Galaxy Z Fold3 5G, Galaxy Z Flip3 5G t???i:\n" +
                        "\uD83D\uDD17 https://didongviet.vn/galaxy-z-fold3-...\n" +
                        "Hot Sale thi???t b??? y t??? ph??ng Covid-19:\n" +
                        "\uD83D\uDD17 https://didongviet.vn/thiet-bi-y-te\n" +
                        "<br/> \n" +
                        "??i???n tho???i h???c online gi?? r???, smartphone h???c online gi?? r???, hay tablet h???c online gi?? r??? ???? tr??? th??nh c???m t??? ???????c t??m ki???m b???c nh???t trong nh???ng tu???n v???a qua. Ng??y t???u tr?????ng ???? tr??? l???i, kh??ng ph???i qu?? v??? ph??? huynh n??o c??ng c?? ??i???u ki???n s???m cho con em m??nh nh???ng thi???t b??? smartphone ho???c tablet ?????t ti???n. D?????i 5 tri???u, nh???ng l???a ch???n h??ng ?????u s??? bao g???m Nokia, Xiaomi - POCO - Redmi, realme v?? c??? Vsmart.\n" +
                        "<br/> \n" +
                        "Xin tr??n tr???ng c???m ??n n???n t???ng ????nh gi?? hi???u n??ng WeTest PerfDog (Full mobile platform performance test and analysis tool) - Download & th??ng tin chi ti???t t???i:\n" +
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
                "Lookback MacBook Pro sau 12 n??m c??n c?? 4 TRI???U!\n",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/zq7qQpvQIx4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                32793,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#MacBookPro #MacBook #ReLab",
                "Lookback MacBook Pro sau 12 n??m c??n c?? 4 TRI???U!\n" +
                        "Tham kh???o gi?? b??n c??c d??ng MacBook, iPad, iPhone t???i:\n" +
                        "\uD83D\uDD17 https://shopdunk.com/mac/\n" +
                        "\uD83D\uDD17 https://shopdunk.com/iphone/\n" +
                        "<br/> \n" +
                        "MacBook Pro gi?? ch??? 4 tri???u th?? c?? g?? nh???? C?? tu???i c??c b???n ??? \uD83E\uDD23 MacBook Pro Mid 2009 v???i c???u h??nh r???t c?? nh?? Intel Core 2 Duo, NVIDIA Geforce 9400M, 4GB RAM ch??? ????? ????p ???ng nh???ng nhu c???u c?? b???n nh?? l?????t web, h???c online, l??m vi???c g?? v??n b???n nh??? nh??ng. B??n ph??m MacBook Pro Mid 2009 g?? r???t s?????ng v???i h??nh tr??nh ph??m s??u, ????? n???y cao, touchpad ph??? k??nh vu???t m?????t m??. ??i???m m???nh c???a nh???ng chi???c MacBook si??u c?? nh?? b???n Mid 2009 n??y l?? c?? r???t nhi???u c???ng k???t n???i, c?? c??? ?????u ?????c ????a quang CD, USB Type-A, ?????u ?????c th??? nh??? SD, jack ethernet RJ45, v.v\n" +
                        "<br/> \n" +
                        "Ph???n m???m ????nh gi?? hi???u n??ng, ??o FPS Wetest Perfdog - Download v?? d??ng th??? MI???N PH?? ngay t???i:\n" +
                        "\uD83D\uDD17 https://www.wetest.net/?utm_source=yt... \n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "Th???c hi???n\n" +
                        "Quay phim | H???u k???: Linh Tr???n\n" +
                        "D???n | Reviewer: @Th??nh Th??? \n" +
                        "N???i dung: @Th??nh Th??? \n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "Tags:\n" +
                        "????nh gi?? smartphone,relab,tu???n ng???c,review ??i???n tho???i,review smartphone,????nh gi?? ??i???n tho???i,c??ng ngh???,th??nh th???t th??,macbook pro,laptop sinh vi??n,laptop cao c???p,macbook pro mid 2009,macbook 2009,????nh gi?? macbook pro 2009,gi?? b??n macbook pro 2009,review macbook pro 2009,macbook pro 2009 gi?? bao nhi??u,laptop c??,macbook pro c??,macbook c??,c?? n??n mua macbook c??,laptop v??n ph??ng,macbook gi?? r???,macbook gi?? t???t\n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "Menu\n" +
                        "00:00 Intro\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "______________________________\n" +
                        "ReLab l?? k??nh truy???n th??ng ????nh gi?? chuy??n s??u c??c s???n ph???m c??ng ngh???, mang l???i c??i nh??n kh??ch quan v?? ch??nh x??c, gi??p c??c b???n ????a ra l???a ch???n d??? d??ng h??n tr?????c khi quy???t ?????nh mua. ?????ng qu??n b???m LIKE, SUBSCRIBE v?? B???M CHU??NG ????? kh??ng b??? l??? b???t k?? video n??o nh??. ???\n" +
                        "<br/> \n" +
                        "\uD83D\uDCE7 Email li??n h??? h???p t??c: ads@navimedia.com.vn\n" +
                        "\uD83D\uDCE7 Contact for work: ads@navimedia.com.vn\n" +
                        "<br/> \n" +
                        "?? B???n quy???n thu???c v??? NAVI MEDIA & RELAB.\n" +
                        "?? Copyright by NAVI MEDIA & RELAB. Please do not Re-up.",
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
                "5 CU???N S??CH THAY ?????I C??CH NH??N CU???C S???NG C???A B???N | 5 books to read now...",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/nVztbNncPME\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                23743,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#sachthaydoicuocsong #trietlycuocsong #hakhuat",
                "Mng ??i m??nh ???? quay tr??? l???i vs chi???c clip review s??ch hay ????y, mong l?? mng enjoy nhaaaa\n" +
                        "Nh???ng cu???n s??ch H?? ????? c???p trong clip: \n" +
                        "1. Lu???t T??m th???c : https://shp.ee/3qrj5rx\n" +
                        "2. 101 essays that will change the way you think \n" +
                        "3. H???o n??? trung hoa: https://shp.ee/t7t5y8f\n" +
                        "4. Ung thu S??? th???t v?? tin ?????n\n" +
                        "5. C???i tr??i linh h???n: https://shp.ee/bidbvtf\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "C??C CH??? T??M M??NH ??? ????Y NHA:\n" +
                        "\uD83D\uDC49\uD83D\uDC49\uD83D\uDC49Insta c???a m??nh nha: rachelkhuat_\n" +
                        "\uD83D\uDC49\uD83D\uDC49\uD83D\uDC49Email: habon1210@gmail.com\n" +
                        "\uD83D\uDC49\uD83D\uDC49\uD83D\uDC49Goodread: https://goo.gl/1HqcdD\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "My background music: \n" +
                        "??? Music Credit: LAKEY INSPIRED\n" +
                        "Track Name: \"Better Days\"<br/> \n" +
                        "Music By: LAKEY INSPIRED @ \n" +
                        "??? Music Credit: Dj Quads\n" +
                        "Track Name: \"It's Near\"<br/> \n" +
                        "??? Music Credit: Artificial.Music\n" +
                        "Track Name: \"And So It Begins\"<br/> \n" +
                        "License for commercial use: Creative Commons Attribution 3.0 Unported CC BY 3.0 License.\n" +
                        "Full License HERE - https://creativecommons.org/licenses/...\n" +
                        "Music promoted by NCM https://goo.gl/fh3rEJ\n" +
                        "<br/> \n" +
                        "* B???m ????ng k??/Subscrie ????? theo d??i m??nh nha c??c ch??? !\n" +
                        "??? ????NG K??/SUBSCRIBE: http://bit.ly/HaKhuat\n" +
                        "#sachthaydoicuocsong #trietlycuocsong #hakhuat\n" +
                        "================================\n" +
                        "?? B???n quy???n thu???c v??? H?? Khu???t\n" +
                        "?? Copyright by H?? Khu???t ??? Do not Reup",
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
                "3 cu???n trinh th??m SI??U HAYYYY | Ai r???i c??ng ph???i ?????c trinh th??m th??i | H?? Khu???t",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/sjDi36nnbps\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                18401,
                Timestamp.valueOf("2021-09-19 20:00:00.00"),
                "#sachtrinhtham #sachhay #hakhuat",
                "Helu c??c b??c sau m???t kho???ng th???i gian nh???n ???????c qu?? nhi???u recommendation c???a c??c b??c th?? t cx ch??nh th???c l???t h??? trinh th??m ???, v?? ????y l?? 3 cu???n m??? r???t t??m ?????c th???i gian qua, mong mng enjoy nhaa....\n" +
                        "<br/> \n" +
                        "NH???NG C??U H???I C??C B???N HAY H???I M??NH: \n" +
                        "1. m??nh quay b???ng m??y g??: canon m100 nha \n" +
                        "2. m??nh edit b???ng: adobe premiere 2020 nha \n" +
                        "3. m??nh th?????ng mua s??ch ???: Tiki, Fahasa \n" +
                        "4. ????? m??nh ??ang m???c: Uniqlo\n" +
                        "5. son m??nh ??ang d??ng: 3CE Smoked rose nha \n" +
                        "<br/> \n" +
                        "* B???m ????ng k??/Subscrie ????? theo d??i m??nh nha c??c ch??? !\n" +
                        "??? ????NG K??/SUBSCRIBE: http://bit.ly/HaKhuat\n" +
                        "#sachtrinhtham #sachhay #hakhuat #thamtu\n" +
                        "================================\n" +
                        "?? B???n quy???n thu???c v??? H?? Khu???t\n" +
                        "?? Copyright by H?? Khu???t ??? Do not Reup",
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
                "DI???P V???N 3 [Thuy???t Minh] | Chung T??? ????n, Mike Tyson | Phim V?? Thu???t H??nh ?????ng Kinh ??i???n Nh???t",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/5kJz1TmbTb8?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                16150991,
                Timestamp.valueOf("2021-10-27 23:00:00.00"),
                "##phimv??thu???t #chungt???????n #kungfu",
                "DI???P V???N 3 | Chung T??? ????n, Mike Tyson | Phim V?? Thu???t H??nh ?????ng Thuy???t Minh.\n" +
                        "\n" +
                        "Di???p V???n 3 ??? Tr???n Chi???n Cu???i C??ng ??? ??? Phim thu???c th??? lo???i h??nh ?????ng do Trung Qu???c s???n xu???t c??u chuy???n n??i v??? m???t nh??n v???t quan tr???ng trong n???n v?? thu???t c???a Trung Qu???c, Phim kh???c ho??? l???i h??nh ???nh th???y tr?? c???a Di???p V???n v?? L?? Ti???u Long, b??n c???nh ???? phim c??n c?? s??? khai th??c m???i gi???a Di???p V???n ?????i ?????u v???i m???t v?? s?? huy???n anh c???a M???, b??n c???nh ???? ??i???m h???p d???n nh???t l?? nh?? s???n xu???t d??ng c??ng ngh??? l??m nh??n v???t huy???n tho???i L?? Ti???u Long s???ng l???i v?? c??n c?? s??? g??p m???t c???a tay ?????m huy???n anh th??? gi???i Mike Tyson. Trong nh???ng c???nh quay Ch??n T??? ??an t??? di???n nh???ng pha h??nh ?????ng m?? kh??ng nh??? th??? th??n n??n b??? phim tr??? n??n r???t thi???t th???t v?? c?? t??nh ch??n th???t khi???n ng?????i xem th??ch th??. Chung T??? ????n s??? v??o vai di???p v???n???!!!\n" +
                        "\n" +
                        "#phimv??thu???t #chungt???????n #kungfu\n" +
                        "\n" +
                        "Ch??n th??nh c???m ??n c??c nh??n h??ng ???? t??i tr???: #pepsi #shopee #lazada #tiki #samsung #iphone #apple #Microsoft #Amazon #Nestle #Unilever #Gojek #Bee #Honda #Yamaha #Toyota",
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
                "DI???P V???N [Thuy???t Minh] | Chung T??? ????n, Nh???m ?????t Hoa | Phim V?? Thu???t Kungfu ?????nh Cao M??n Nh??n Nh???t",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/pTYa27TLyxM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                13438719,
                Timestamp.valueOf("2019-09-24 18:00:00.00"),
                "#phimh??nh?????ng #phimv??thu???t #chungt???????n",
                "DI???P V???N [Thuy???t Minh] | Chung T??? ????n, Nh???m ?????t Hoa - Phim V?? Thu???t Kungfu V???nh Xu??n Quy???n.\n" +
                        "\n" +
                        "Di???p V???n b???y gi??? ???????c m???i ng?????i cho l?? cao th??? b???c nh???t c???a V???nh Xu??n Quy???n. L??u s?? ph??? m???i m??? m???t l?? v?? v?? mu???n ?????n Di???p gia xin 'ch??? gi??o' trong m???t tr???n ?????u b?? m???t. Di???p V???n ???? chi???n th???ng m???t c??ch d??? d??ng, t??ng th??m s??? ng?????ng m??? c???a m???i ng?????i ?????i v???i anh. Kh??ng l??u sau, m???t t??n th???o kh???u t??n l?? Kim S??n Tr???o c??ng b?? l?? ?????n v??ng Ph???t S??n, h???n cho r???ng n???u ?????u v?? th???ng Di???p V???n, h???n s??? ???????c ng?????i d??n ???ng h??? v?? xin theo h???c v?? c??ng. Nh??ng Di???p V???n ???? ???d???y d?????? S??n Tr???o b???ng b???n m??n c??ng phu c???a V??nh Xu??n l?? quy???n, c?????c, li???u di???p ??ao, v?? c??n th???ng nh?? v???y...?\n" +
                        "\n" +
                        "#phimh??nh?????ng #phimv??thu???t #chungt???????n\n" +
                        "\n" +
                        "Ch??n th??nh c???m ??n c??c nh??n h??ng ???? t??i tr???: #pepsi #shopee #lazada #tiki #samsung #iphone #apple #Microsoft #Amazon #Nestle #Unilever #Gojek #Bee #Honda #Yamaha #Toyota",
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
                "CU???NG TH?? [Thuy???t Minh] | Phim V?? Thu???t H??nh ?????ng Kungfu Hay Nh???t",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/9Tp2PXLh2AQ?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                5566634,
                Timestamp.valueOf("2019-10-26 20:00:00.00"),
                "#PHIMV??THU???T #PHIMH??NH?????NG #KUNGFU",
                "CU???NG TH?? | Phim H??nh ?????ng V?? Thu???t Kungfu Kinh ??i???n Nh???t Thuy???t Minh.\n" +
                        "\n" +
                        "N???i dung: Phim Cu???ng Th?? k??? v??? c??u chuy???n huynh ????? t????ng t??n, c???nh s??t v?? b???n c?????p trong s??? c??m d??? c???a ti???n b???c. M???i c??c b???n ????n xem di???n bi???n c???a t???p phim s??? di???n ra nh?? th??? n??o nh??! Ch??c c??c b???n m???t ng??y vui v??? ^^!\n" +
                        "\n" +
                        "#PHIMV??THU???T #PHIMH??NH?????NG #KUNGFU",
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
                "PHIM H??NH ?????NG XH?? S??T TH??? N???M V??NG | TINH ANH PHI H??? | V?? Thu???t Chi???u R???p Hay Nh???t",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/csjuHllTGi8?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                40959,
                Timestamp.valueOf("2021-11-06 21:30:00.00"),
                "#phimh??nh?????ng #phimv??thu???t #phimchi???ur???p",
                "Phim H??nh ?????ng V?? Thu???t Si??u S??t Th??? Hay Nh???t Chi???u R???p | Tinh Anh Phi H??? - Ng?? M???nh ?????t, Tr???nh T?? V??n.\n" +
                        "\n" +
                        "Sau c??i ch???t c???a con trai m??nh, Bi Nh???(Ng?? M???nh ?????t) ???? ????? ?????a con trai c??n tham gia v??o m???t nh??m c???nh s??t ??u t?? ???????c g???i l?? \"Phi H???\" v?? t??m hi???u ?? ngh??a th???c s??? c???a c??ng l??. \n" +
                        "\n" +
                        "#phimh??nh?????ng #phimv??thu???t #phimchi???ur???p #s??tth??? #ng??m???nh?????t #phimhay #phimm???i",
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
                "S??T TH??? TH??? M??Y - JASON STATHAM - Phim H??nh ?????ng V?? Thu???t M??? Chi???u R???p Thuy???t Minh",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/b1L2Cf5_Cew?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                957499,
                Timestamp.valueOf("2021-10-12 23:00:00.00"),
                "#unimovie #phimhanhdong #phimvothuat",
                "S??T TH??? TH??? M??Y - JASON STATHAM - Phim H??nh ?????ng V?? Thu???t M??? Chi???u R???p Thuy???t Minh\n" +
                        "<br/> \n" +
                        "???UNI MOVIE - N??i h???i t??? nh???ng b??? phim h??nh ?????ng v?? thu???t, phim chi???u r???p M??? Trung Qu???c thuy???t minh m???i nh???t, hay nh???t, h???p d???n nh???t 2020.\n" +
                        "???UNI MOVIE - Kho phim c???a m???i nh??! \uD83D\uDD14 \n" +
                        "\uD83D\uDD14 ????ng k?? k??nh v?? nh???n chu??ng th??ng b??o ????? ????n xem nh???ng t???p phim hay nh???t:https://www.youtube.com/UniMovie?sub_confirmation=1" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Giao l??u v???i Uni Movie qua Fanpage - N??i quy t??? nh???ng anh h??ng ch??n ch??nh:https://www.facebook.com/unimoviestar" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Tik Tok Uni Movie: https://www.tiktok.com/@unimovie" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Uni Movie - Kho Phim C???a M???i Nh??:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYrCq-cApgNiK2exuihI27I\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Ki???m Hi???p M???i Hay Nh???t:https://www.youtube.com/PhimKiemHiepOfficial?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Drama, Ng??n T??nh M???i Hay Nh???t:https://www.youtube.com/UniDrama?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim H??nh ?????ng Chi???u R???p M???:https://www.youtube.com/HDMovieStar?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim V?? Thu???t Chi???u R???p M???:https://www.youtube.com/SKLMovie?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng Chi???n Tranh M??? Trung Qu???c Thuy???t Minh Hay Nh???t:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYRtdJx5a6WuxLfz9-Ocuzs\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng V?? Thu???t M??? Trung Qu???c 2020 Thuy???t Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZbUQoPT77p9aRwI17xnVVl\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng Chi???u R???p M??? M???i Hay Nh???t 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaebaHNVSkv5opKOuLOg52U2y\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng Khoa H???c Vi???n T?????ng Chi???u R???p M??? 2020 Thuy???t Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYEpsmphokgeyKt0NjkV7ZX\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng H???p Phim H??nh ?????ng Kinh D??? Chi???u R???p M??? 2020 Thuy???t Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeY_tK8tmmIyaLCs1Ag7sWHi\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim T??m L?? Tinh C???m L??ng M???n ??u M??? Hay Nh???t 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZ56cDFyw-skOgChbTInOtS\n" +
                        "<br/> \n" +

                        "-------- ??? ---------\n" +
                        "?? B???n quy???n thu???c v??? UNI MOVIE. Kh??ng Reup d?????i m???i h??nh th???c!\n" +
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
                "BI???N C?? M???P - Phim H??nh ?????ng Chi???u R???p K???ch T??nh Thuy???t Minh",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MblP1p1NaOY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                19624,
                Timestamp.valueOf("2021-11-10 23:00:00.00"),
                "#unimovie #phimhanhdong #phimvothuat",
                "BI???N C?? M???P - Phim H??nh ?????ng Chi???u R???p K???ch T??nh Thuy???t Minh\n" +
                        "<br/> \n" +
                        "???UNI MOVIE - N??i h???i t??? nh???ng b??? phim h??nh ?????ng v?? thu???t, phim chi???u r???p M??? Trung Qu???c thuy???t minh m???i nh???t, hay nh???t, h???p d???n nh???t 2020.\n" +
                        "???UNI MOVIE - Kho phim c???a m???i nh??! \uD83D\uDD14 \n" +
                        "\uD83D\uDD14 ????ng k?? k??nh v?? nh???n chu??ng th??ng b??o ????? ????n xem nh???ng t???p phim hay nh???t:https://www.youtube.com/UniMovie?sub_confirmation=1" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Giao l??u v???i Uni Movie qua Fanpage - N??i quy t??? nh???ng anh h??ng ch??n ch??nh:https://www.facebook.com/unimoviestar" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Tik Tok Uni Movie: https://www.tiktok.com/@unimovie" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Uni Movie - Kho Phim C???a M???i Nh??:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYrCq-cApgNiK2exuihI27I\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Ki???m Hi???p M???i Hay Nh???t:https://www.youtube.com/PhimKiemHiepOfficial?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim Drama, Ng??n T??nh M???i Hay Nh???t:https://www.youtube.com/UniDrama?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim H??nh ?????ng Chi???u R???p M???:https://www.youtube.com/HDMovieStar?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC Phim V?? Thu???t Chi???u R???p M???:https://www.youtube.com/SKLMovie?sub_confirmation=1\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng Chi???n Tranh M??? Trung Qu???c Thuy???t Minh Hay Nh???t:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYRtdJx5a6WuxLfz9-Ocuzs\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng V?? Thu???t M??? Trung Qu???c 2020 Thuy???t Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZbUQoPT77p9aRwI17xnVVl\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng Chi???u R???p M??? M???i Hay Nh???t 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaebaHNVSkv5opKOuLOg52U2y\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim H??nh ?????ng Khoa H???c Vi???n T?????ng Chi???u R???p M??? 2020 Thuy???t Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeYEpsmphokgeyKt0NjkV7ZX\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng H???p Phim H??nh ?????ng Kinh D??? Chi???u R???p M??? 2020 Thuy???t Minh:https://www.youtube.com/playlist?list=PLzQmA4UVLaeY_tK8tmmIyaLCs1Ag7sWHi\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC T???ng h???p Phim T??m L?? Tinh C???m L??ng M???n ??u M??? Hay Nh???t 2020:https://www.youtube.com/playlist?list=PLzQmA4UVLaeZ56cDFyw-skOgChbTInOtS\n" +
                        "<br/> \n" +

                        "-------- ??? ---------\n" +
                        "?? B???n quy???n thu???c v??? UNI MOVIE. Kh??ng Reup d?????i m???i h??nh th???c!\n" +
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
                "PHIM M???I 2021 | PHI V??? TI???N GI??? | Ch??u Nhu???n Ph??t | Phim H??nh ?????ng V?? Thu???t Chi???u R???p Thuy???t Minh",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/_fZzEssjPBc?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                4616402,
                Timestamp.valueOf("2020-09-04 07:00:00.00"),
                "#phimhanhdong #phimthuyetminh #phimvothuat",
                "Phi V??? Ti???n Gi??? - Ch??u Nhu???n Ph??t - Qu??ch Ph?? Th??nh l?? phim h??nh ?????ng v?? thu???t, phim hay 2019 thuy???t minh, phim chi???u r???p, phim hay 2020 thuy???t minh.\n" +
                        "N???i dung ch??nh:\n" +
                        "C???nh s??t H???ng K??ng ???? ph?? v??? m???t phi v??? ti???n gi??? ?????ng tr???i v?? b???t ???????c Lee Man, m???t th??nh vi??n ch??? ch???t c???a ???????ng d??y ti???n gi??? khi h???n ??ang ch???y tr???n sang Th??i Lan. C??c thanh tra c???nh s??t ??ang n??? l???c t??m ra ch??n t????ng c???a Painter, k??? ch??? m??u ?????ng ?????u b??ng ?????ng l??m ti???n gi??? t??? l???i khai c???a Lee Man.\n" +
                        "B???t ch???p s??? truy ??u???i m???nh m??? c???a c???nh s??t, b??ng ?????ng c???a Painter l???a mua ???????c gi???y in ti???n v?? c?????p ???????c m???t xe t???i ch??? m???c b???o m???t ????? s???n xu???t h??ng lo???t c??c t??? ti???n ???? gi??? c?? th??? qua m???t ???????c c??? nh???ng chuy??n gia ti???n t???. S??? c???nh s??t nh???n ra h??? ph???i ?????i m???t v???i m???t k??? th?? m???nh h??n h??? t?????ng...\n" +
                        "----------??????----------\n" +
                        "<br/> \n" +
                        "???UNI MOVIE - N??i h???i t??? nh???ng b??? phim h??nh ?????ng v?? thu???t, phim chi???u r???p M??? Trung Qu???c thuy???t minh m???i nh???t, hay nh???t, h???p d???n nh???t 2020.\n" +
                        "???UNI MOVIE - Kho phim c???a m???i nh??! \uD83D\uDD14 \n" +
                        "\uD83D\uDD14 ????ng k?? k??nh v?? nh???n chu??ng th??ng b??o ????? ????n xem nh???ng t???p phim hay nh???t:https://www.youtube.com/UniMovie?sub_confirmation=1" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Giao l??u v???i Uni Movie qua Fanpage - N??i quy t??? nh???ng anh h??ng ch??n ch??nh:https://www.facebook.com/unimoviestar" +
                        "<br/> \n" +
                        "\uD83D\uDCCC Tik Tok Uni Movie: https://www.tiktok.com/@unimovie" +
                        "<br/> \n" +
                        "----------??????----------\n" +
                        "\uD83D\uDCFA T???ng h???p Phim H??nh ?????ng Chi???u R???p M??? M???i Hay Nh???t 2020:https://www.youtube.com/watch?v=3CDjrz2zfG0&list=PLzQmA4UVLaebaHNVSkv5opKOuLOg52U2y&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA T???ng h???p Phim H??nh ?????ng V?? Thu???t M??? Trung Qu???c 2020 Thuy???t Minh:https://www.youtube.com/watch?v=XXBpXCKvAy0&list=PLzQmA4UVLaeZbUQoPT77p9aRwI17xnVVl&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA T???ng H???p Phim H??nh ?????ng Kinh D??? Chi???u R???p M??? 2020 Thuy???t Minh:https://www.youtube.com/watch?v=fIXW368w1Lw&list=PLzQmA4UVLaeY_tK8tmmIyaLCs1Ag7sWHi&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA T???ng h???p Phim H??nh ?????ng Khoa H???c Vi???n T?????ng Chi???u R???p M??? 2020 Thuy???t Minh:https://www.youtube.com/watch?v=36f7YVhEKVc&list=PLzQmA4UVLaeYEpsmphokgeyKt0NjkV7ZX&t=0s\n" +
                        "<br/> \n" +
                        "\uD83D\uDCFA T???ng h???p Phim T??m L?? Tinh C???m L??ng M???n ??u M??? Hay Nh???t 2020:https://www.youtube.com/watch?v=SfiIPktCOEk&list=PLzQmA4UVLaeZ56cDFyw-skOgChbTInOtS&t=0s\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC BI???T K??CH NG???M | Phim H??nh ?????ng V?? Thu???t Chi???u R???p M??? Thuy???t Minh M???i Hay Nh???t:\n" +
                        "https://www.youtube.com/watch?v=vO5fq...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC CU???NG N??? - FURY | Brad Pitt | Phim H??nh ?????ng Chi???n Tranh Chi???u R???p M??? 2019 Thuy???t Minh:\n" +
                        "https://www.youtube.com/watch?v=0Bfv2...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC S??T TH??? CHUY??N NGHI???P - Jason Statham | Phim H??nh ?????ng V?? Thu???t Chi???u R???p M??? 2019 Thuy???t Minh:\n" +
                        "https://www.youtube.com/watch?v=dbCBh...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC ??I???P V??? TAM GI??C V??NG | Phim H??nh ?????ng V?? Thu???t Chi???u R???p Trung Qu???c 2019 Thuy???t Minh:\n" +
                        "https://www.youtube.com/watch?v=aphxJ...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC NG?????I T?? KH??? SAI | Phim H??nh ?????ng H??nh S??? Chi???u R???p M??? 2020 Thuy???t Minh:\n" +
                        "https://www.youtube.com/watch?v=68E1O...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC TR??? L?? H???T ?? - The UPSIDE - Phim H??nh ?????ng H??i ??u M??? Chi???u R???p Hay Nh???t 2020 - Uni Movie:\n" +
                        "https://www.youtube.com/watch?v=-AsU2...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC KH??NG GIAN M?? HO???C - ATTRACTION - Phim H??nh ?????ng Chi???u R???p Khoa H???c Vi???n T?????ng Hay Nh???t 2020:\n" +
                        "https://www.youtube.com/watch?v=C63Ze...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC CHI???N BINH FRANKENSTEIN - Phim H??nh ?????ng Khoa H???c Vi???n T?????ng Chi???u R???p M??? Vietsub M???i Hay Nh???t 2020:\n" +
                        "https://www.youtube.com/watch?v=QM4H7...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC NH??? G???P H??N - Phim H??i H??nh ?????ng Chi???u R???p M??? M???i Hay Nh???t 2020:\n" +
                        "https://youtu.be/IUIZBrJEeiw\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC CHI???N BINH MEXICO - Phim Bom T???n H??nh ?????ng M??? Chi???u R???p M???i Hay Nh???t 2020:\n" +
                        "https://www.youtube.com/watch?v=65eYb...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC S??NG D??? | L??u ?????c Hoa, Ng?? Tr??c Hy | Phim H??nh ?????ng Chi???u R???p 2020 Thuy???t Minh:\n" +
                        "https://www.youtube.com/watch?v=3CDjr...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC ??I???P V??? T???I M???T | Phim H??nh ?????ng V?? Thu???t H??nh S??? Chi???u R???p Trung Qu???c 2020 Thuy???t Minh:\n" +
                        "https://www.youtube.com/watch?v=4EBpf...\n" +
                        "<br/> \n" +
                        "\uD83C\uDFAC THANH TR???NG - Phim H??nh ?????ng V?? Thu???t Chi???u R???p Trung Qu???c 2020 Thuy???t Minh:\n" +
                        "https://www.youtube.com/watch?v=BKexG...\n" +
                        "----------??????---------- \n" +
                        "?? B???n quy???n thu???c v??? UNI MOVIE. Kh??ng Reup d?????i m???i h??nh th???c!\n" +
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
                "C??ch D??? Nh???t ????? H???c Gi???i (D?? cho b???n r???n)",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/vIk5zZ3YA38?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                213207,
                Timestamp.valueOf("2021-10-01 18:00:00.00"),
                "#web5ngay #bhth #baihoctamhuyet",
                "L???ch ph??t s??ng:\n" +
                        "\uD83D\uDFE1 7h t???i th??? 7??????: B??i h???c t??m huy???t.\n" +
                        "\uD83D\uDFE0 7h t???i th??? 3??????: Video Tri k??? c???m x??c.\n" +
                        "\uD83D\uDFE2 7h t???i th??? 5??????: B??i h???c si??u ng???n.\n" +
                        "C??c b???n nh??? ????n xem nghen!" +
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
                "5 B??i H???c V?? Gi?? ???? C???u S???ng ?????i T??i | Web5ngay",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/LSFpJOFHw1A?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                469912,
                Timestamp.valueOf("2021-06-26 18:00:00.00"),
                "#web5ngay #bhth #baihoctamhuyet",
                "\uD83D\uDFE1 Tr??? th??nh fanVIP: https://www.youtube.com/channel/UCkgjUHB8sdWbmdp39swMrTg \n" +
                        "M???n ch??o t???t c??? qu?? v??? v?? c??c b???n. \n" +
                        "Hi???n t???i, th?? tui ???? up h??n 300 video l??n k??nh Web5ngay Vi???t Nam r???i. \n" +
                        "300 video th?? kh?? l?? d??i. V?? c?? l??? s??? c?? nhi???u b???n mong mu???n 1 video t???ng h???p t???t c??? nh???ng g?? tinh t??y nh???t ?????ng ?????ng sau h??n 300 b??i ????. \n" +
                        "Ok, tui l??m th??i hihi.\n" +
                        "10 b??i h???c tinh t??y nh???t trong h???c vi???n h??n 300 video, s??? t???ng h???p l???i trong duy nh???t 1 b??i n??y.\n" +
                        "10 b??i h???c h??y, ko ch??? g???n li???n v???i h??n 300 video, m?? c??n g???n li???n v???i cu???c ?????i nh??n qu??? c???a t??i n???a.\n" +
                        "Nh???ng khi bu???n, nh???ng ng??y ngh??o kh???, nh???ng l??c c??? k??? tuy???t v???ng, nh???ng l??c b??? ng?????i kh??c coi th?????ng, n???u ko c?? 10 b??i h???c n??y, th?? ko bi???t ?????i t??i gi??? th??? n??o lu??n ????. \n" +
                        "Xin m???n ph??p g???i ????y l??: 5 b??i h???c v?? gi?? ???? c???u s???ng ?????i t??i. \n" +
                        "V?? xin c???m ??n t???t c??? nh??ng c?? duy??n, kinh nghi???m, v?? ki???n th???c khoa h???c m?? t??i h???c ???????c, ???? gi??p n??ng c???p ?????i t??i.\n" +
                        "<br/> \n" +
                        "B??? c???c:\n" +
                        "0:00 Y??u c??c b???n\n" +
                        "1:32 B??i h???c 1\n" +
                        "8:30 B??i h???c 2\n" +
                        "14:10 B??i h???c 3\n" +
                        "20:22 B??i h???c 4\n" +
                        "28:03 B??i h???c 5\n" +
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
                "Ch???a b???nh ???Kh??ng m???c ????ch, kh??ng ??am m??, ko bi???t ?????i m??nh v??? ????u???",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/1kseOrqyeqE?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                745274,
                Timestamp.valueOf("2021-06-05 18:00:00.00"),
                "#bhth",
                "\uD83D\uDFE1 Tr??? th??nh fanVIP: https://www.youtube.com/channel/UCkgjUHB8sdWbmdp39swMrTg \n" +
                        "Ch???a b???nh ???Kh??ng m???c ????ch, kh??ng ??am m??, ko bi???t ?????i m??nh v??? ????u???\n" +
                        "Chapters:\n" +
                        "0:00 C??u h???i quan tr???ng \n" +
                        "04:21 Ch???n\n" +
                        "17:21 Ch???a\n" +
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
                "V?? sao ?????c S??ch c?? th??? thay ?????i ?????i b???n (gi??u c??, kh??n ngoan, n???i ti???ng)",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/9vj2c78gBNw?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                154997,
                Timestamp.valueOf("2021-10-30 18:00:00.00"),
                "#web5ngay",
                "V?? sao ?????c S??ch c?? th??? thay ?????i ?????i b???n (gi??u c??, kh??n ngoan, n???i ti???ng)",
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
                "H???C B??I C??NG M??NH NH??! // study with me #7 (real time, with piano bgm) // jawonee",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MJJYkkmE1lM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                731634,
                Timestamp.valueOf("2020-12-13 18:00:00.00"),
                "#jawonee",
                "\uD83D\uDCD6 c???c c???c! C???u c?? ??ang ??n thi hong? N???u ??ang ??n thi th?? h??y v??o ????y h???c chung v???i t??? nha! Mong l?? video n??y c???a m??nh s??? gi??p c???u h???c t???p trung h??n, hi???u qu??? h??n nha. S???p thi r???i, ?????ng ??p l???c qu??. M??nh ??? ????y v?? y??u th????ng c???u\n" +
                        "<br/> \n" +
                        "\uD83D\uDCD6  M???t v??i m??n ????? trong video:\n" +
                        "<br/> \n" +
                        "B??n h???c: https://jangin.vn/shop/bo-ban-hoc-h-t...\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "?????ng h??? ????n LED: https://shp.ee/ewjqisd\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Gi?? ????? s??ch: https://shp.ee/4a7h8dd\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "T???p Klong math notebook: https://shp.ee/gbfwfbf\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "?????ng h??? b???m gi???: https://shp.ee/hq6peav\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "B??t m??y: https://shp.ee/kriyx2x\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Tombow dual brush pen: https://shp.ee/rq99q47\n" +
                        " / https://shp.ee/j9tjwp7\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Zebra Mildliner m??u Violet: https://shp.ee/2umwh67\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "B??t gel Kaco: https://shp.ee/i8hqn57\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "\uD83D\uDCD6 Music/??m nh???c trong video\n" +
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
                        "\uD83D\uDCD6 Nh???ng ??i???u m?? b???n c?? th??? h???i m??nh:\n" +
                        "<br/> \n" +
                        "1. B???n t??n g??? Bao nhi??u tu???i?\n" +
                        "- M??nh l?? Nguy??n, b???n c??ng c?? th??? g???i m??nh l?? Jawon, M??nh sinh n??m 2004 ^^\n" +
                        "<br/> \n" +
                        "2. B???n edit video b???ng app g???\n" +
                        "- M??nh edit b???ng VLLO, VITA, Inshot, SNOW\n" +
                        "<br/> \n" +
                        "3. B???n l??m thumbnail b???ng app g???\n" +
                        "- M??nh l??m thumbnail b???ng Sketchbook v?? Phonto\n" +
                        "<br/> \n" +
                        "4. B???n s??? d???ng d???ng c??? g?? ????? quay?\n" +
                        "- M??nh d??ng Samsung Galaxy Note10 v?? Tripod YF-3388\n" +
                        "<br/> \n" +
                        "5. V?? sao b???n l???i t???o ra channel n??y?\n" +
                        "<br/> \n" +
                        "- V?? m??nh mu???n chia s??? nh???ng kinh nghi???m h???c t???p ?????ng th???i truy???n c???m h???ng h???c t???p cho m???i ng?????i!\n" +
                        "<br/> \n" +
                        "6. V?? sao b???n kh??ng l???ng ti???ng cho video?\n" +
                        "<br/> \n" +
                        "- V?? gi???ng n??i kh??ng ph???i l?? th??? m???nh c???a m??nh v?? tr??n h???t ????y l?? phong c??ch m??nh mu???n theo ??u???i, hi???n t???i m??nh v???n r???t h??i l??ng v??? n?? ^^\n" +
                        "<br/> \n" +
                        "\uD83D\uDCD6 K???t n???i v???i m??nh nh??: \n" +
                        "<br/> \n" +
                        "Instagram: @jawonee._\n" +
                        "<br/> \n" +
                        "Facebook: https://www.facebook.com/Jawonee-5760\n" +
                        "...\n" +
                        "<br/> \n" +
                        "-------\n" +
                        "<br/> \n" +
                        "study with me study motivation h???c c??ng m??nh h???c t???p hi???u qu??? study inspiration h???c v??n c??ng m??nh h???c ti???ng anh c??ch ??n thi hi???u qu???",
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
                "H???C B??I C??NG M??NH // study with me #8 (real time, with piano music) // jawonee",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/pITmw14bvpM?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                450927,
                Timestamp.valueOf("2021-02-17 18:00:00.00"),
                "#jawonee",
                "\uD83C\uDF3B Ch???c m???i ng?????i c??ng b???t ?????u quay l???i h???c t???p r???i nh???? D?? l?? ?????n tr?????ng hay h???c online th?? b???n m??nh h??y c??ng nhau c??? g???ng nha!!! M??nh mong l?? video n??y s??? gi??p b???n h???c t???p trung h??n.\n" +
                        "<br/> \n" +
                        "\uD83C\uDF3B Th??ng tin s???n ph???m\n" +
                        "<br/> \n" +
                        "B??t Tombow dual brush pen - m??u 993: https://shp.ee/jz6bycg\n" +
                        "<br/> \n" +
                        "B??t Kaco pure: https://shp.ee/zdmbtv9 \n" +
                        "<br/> \n" +
                        "B??t Zebra Mildliner - m??u Gold: https://shp.ee/ugzi84d\n" +
                        "<br/> \n" +
                        "B??t brush Baoke - ng??i S22: https://shp.ee/gbf92wj\n" +
                        "<br/> \n" +
                        "M??nh d??ng t???p ph??t th?????ng c???a tr?????ng nh??.\n" +
                        "<br/> \n" +
                        "\uD83C\uDF3B ??m nh???c trong video\n" +
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
                        "\uD83C\uDF3B Nh???ng ??i???u m?? b???n c?? th??? h???i m??nh: \n" +
                        "<br/> \n" +
                        "1. B???n t??n g??? Bao nhi??u tu???i?\n" +
                        "- M??nh l?? Nguy??n, b???n c??ng c?? th??? g???i m??nh l?? Jawon, M??nh sinh n??m 2004 ^^ \n" +
                        "<br/> \n" +
                        "2. B???n edit video b???ng app g???\n" +
                        "- M??nh edit b???ng VLLO, VITA, Inshot, SNOW \n" +
                        "<br/> \n" +
                        "3. B???n l??m thumbnail b???ng app g???\n" +
                        "- M??nh l??m thumbnail b???ng Sketchbook v?? Phonto \n" +
                        "<br/> \n" +
                        "4. B???n s??? d???ng d???ng c??? g?? ????? quay?\n" +
                        "- M??nh d??ng Samsung Galaxy Note10 v?? Tripod YF-3388 \n" +
                        "<br/> \n" +
                        "5. V?? sao b???n l???i t???o ra channel n??y? \n" +
                        "<br/> \n" +
                        "- V?? m??nh mu???n chia s??? nh???ng kinh nghi???m h???c t???p ?????ng th???i truy???n c???m h???ng h???c t???p cho m???i ng?????i! \n" +
                        "<br/> \n" +
                        "6. V?? sao b???n kh??ng l???ng ti???ng cho video? \n" +
                        "<br/> \n" +
                        "- V?? gi???ng n??i kh??ng ph???i l?? th??? m???nh c???a m??nh v?? tr??n h???t ????y l?? phong c??ch m??nh mu???n theo ??u???i, hi???n t???i m??nh v???n r???t h??i l??ng v??? n?? ^^ \n" +
                        "<br/> \n" +
                        "\uD83C\uDF3B K???t n???i v???i m??nh nh??: \n" +
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
                "C??ch t??? h???c Ti???ng Anh ??? nh?? v???n ti???n b??? nhanh | VyVocab Ep.44 | Kh??nh Vy",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gvtKHz7MWpo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                109690,
                Timestamp.valueOf("2020-11-06 18:00:00.00"),
                "#khanhvy #tienganh",
                "C??ch h???c Ti???ng Anh nhanh nh???t?\n" +
                        "<br/> \n" +
                        "Ui ch?? ch??, c??ch g?? ???? ta!?! N??i ch??? m??nh th???y ??? If it's important to you, you'll find the way. If not, you'll make excuses - N???u m?? n?? th???t s??? quan tr???ng v???i b???n, b???n s??? t??m c??ch. N???u kh??ng, b???n s??? t??m l?? do\". M??nh hi???u nh???ng th???i ??i???m b???n nh???n th???c ???????c h???c ti???ng Anh l?? quan tr???ng nh??ng v???n ch??a th??? b???t tay th???c hi???n b???n b??? ???????c. C?? th??? ???? l?? l??c m???c ti??u ch??a qu?? r?? r??ng v?? th???t s??? quan tr???ng v???i b???n. Y??n t??m, khi ???? c?? m???c ti??u m?? m??nh ???s???ng c??n\" c??ng n??, th?? ????o n??i l???p b??? c??ng l??m ???????c ch??? hu???ng g?? l?? Ti???ng Anh nh???. \n" +
                        "<br/> \n" +
                        "V??? App MochiMochi ti???ng Anh\n" +
                        "- Link ????ng k?? kho?? h???c v?? ???????c gi???m 30%: https://bom.to/vbEJL7\n" +
                        "<br/> \n" +
                        "- Tr???i nghi???m MochiMochi t???i: https://learn.mochidemy.com/\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "Ngu???n tham kh???o:\n" +
                        "Quy t???c 10,000 gi??? v?? 20 gi???:\n" +
                        "https://www.youtube.com/watch?v=5MgBi...\n" +
                        "<br/> \n" +
                        "TIMESPTAMP:\n" +
                        "0:00 - 1:34 - C??ch nhanh nh???t\n" +
                        "1:35 - 2:28 - Quy t???c 10,000 gi??? v?? 20 gi???\n" +
                        "2:29 - 3:21 - SMART Goals\n" +
                        "3:22 - 4:53 - M???o n??i Ti???ng Anh t??y h??n\n" +
                        "4:54 - 5:29 - Ch??n qu?? th?? h???c sao?\n" +
                        "5:30 - 8:26 - App h???c Ti???ng Anh \n" +
                        "8:27 - 8:56 - Follow nh???ng trang n??y\n" +
                        "8:57 - 9:39 - M???o n??i Ti???ng Anh m?????t h??n\n" +
                        "9:40 - 10:12 - B?? k??p luy???n nghe\n" +
                        "<br/> \n" +
                        "??? Nh???n ????ng k?? t???i: https://bit.ly/2H6G8cO\n" +
                        "<br/> \n" +
                        "#khanhvy #tienganh\n" +
                        "??? Follow me: \n" +
                        "?? Fanpage: https://www.facebook.com/khanhvyofficial\n" +
                        ".\n" +
                        "?? Instagram: https://www.instagram.com/khanhvyccf\n" +
                        "<br/> \n" +
                        "Mail:   contact.khanhvy@gmail.com\n" +
                        "--------------------------/---------------------------------------------------\n" +
                        "?? B???n quy???n thu???c v??? Kh??nh Vy OFFICIAL\n" +
                        "?? Copyright by Khanh Vy OFFICIAL ??? Do not Reup",
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
                "C??ch Nhanh Nh???t ????? H???c Ti???ng Anh | The fastest way to learn English? VyVocab Ep.88",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gvtKHz7MWpo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1459118,
                Timestamp.valueOf("2020-03-13 18:00:00.00"),
                "",
                "C??ch t??? h???c Ti???ng Anh ??? nh?? m?? v???n hi???u qu??? v?? ti???n b??? nhanh.\n" +
                        "??? INSTAGRAM V?? FACEBOOK C???A M??NH ????Y:\n" +
                        "?? Facebook: https://www.facebook.com/khanhvytran218\n" +
                        " \n" +
                        "?? Fanpage: https://www.facebook.com/khanhvyofficial\n" +
                        ".\n" +
                        "?? Instagram:  @khanhvyccf\n" +
                        "--------------------------/---------------------------------------------------\n" +
                        "?? B???n quy???n thu???c v??? Kh??nh Vy OFFICIAL\n" +
                        "?? Copyright by Khanh Vy OFFICIAL ??? Do not Reup",
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
                "M???t g???c Ti???ng Anh, t??? h???c th??? n??o ????? gi???i l??n? | VyVocab Ep.47 | Kh??nh Vy",
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gvtKHz7MWpo?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                2200221,
                Timestamp.valueOf("2020-04-11 18:00:00.00"),
                "#onhacoShopee",
                "??? nh?? m??a n??y th???t h???p l?? ????? t???n d???ng h???c v?? ??n ti???ng anh ????. \n" +
                        "N???u c??c b???n c???n d???ng c??? h???c t???p hay s??ch v??? ????? h???c th?? c??? l??n Shopee nha, v???a c?? Flash Sale 3 khung gi???, gi?? b??nh ???n m?? c??n freeship t??? nay ?????n 24.04. ?????c bi???t ng??y 15 v?? 24 l?? 2 ng??y sale l???n ????: https://bit.ly/2UZ1GgN\n" +
                        "#onhacoShopee\n" +
                        "C???m ??n Shopee ???? ?????ng h??nh c??ng Vy trong t???p n??y.\n" +
                        "<br/> \n" +
                        "<br/> \n" +
                        "??? Nh???n ????ng k?? t???i: https://bit.ly/2H6G8cO\n" +
                        "??? FACEBOOK V?? INSTAGRAM C???A T???\"<br/> \n" +
                        "?? Facebook: https://www.facebook.com/khanhvytran218 \n" +
                        "?? Fanpage: https://www.facebook.com/khanhvyofficial.\n" +
                        "?? IG: @khanhvyccf\n" +
                        "--------------------------/---------------------------------------------------\n" +
                        "?? B???n quy???n thu???c v??? Kh??nh Vy OFFICIAL\n" +
                        "?? Copyright by Khanh Vy OFFICIAL ??? Do not Reup",
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
                "Nh???ng Thi???t B??? C??ng Ngh??? S??? Khi???n B???n Ph??t Cu???ng - 7 Ng??y C??ng Ngh???",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/vAmNuhRMBvs?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                25904,
                Timestamp.valueOf("2021-04-26 20:00:00.00"),
                "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin",
                "N??i gi???i thi???u nh???ng c??ng ngh??? ?????nh cao m???i nh???t\n" +
                        "\uD83D\uDD14 Theo d??i k??nh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA T???ng h???p PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thi???t B??? Th??ng Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Nh???ng C??ng Ngh??? V?? Trang T??n Ti???n Nh???t: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Ph????ng Ti???n ??i l???i Th???i Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C N???u b???n y??u th??ch video, ?????ng qu??n ????ng k?? v?? nh???n v??o n??t \uD83D\uDD14 ????? c???p nh???t nh???ng video m???i nh???t c???a k??nh nha!!!\n" +
                        "?????????????????? C???m ??n b???n ???? xem video v?? quan t??m k??nh ??????????????????" +
                        "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin\n" +
                        "#c??ngngh???m???i\n",
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
                "10 Thi???t B??? Th??ng Minh Gi??p C???i Thi???n C???a S???ng C???a B???n #7 - 7 Ng??y C??ng Ngh???",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/HxyiRFqo6Y0?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                6458,
                Timestamp.valueOf("2021-04-26 20:00:00.00"),
                "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin",
                "N??i gi???i thi???u nh???ng c??ng ngh??? ?????nh cao m???i nh???t\n" +
                        "\uD83D\uDD14 Theo d??i k??nh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA T???ng h???p PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thi???t B??? Th??ng Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Nh???ng C??ng Ngh??? V?? Trang T??n Ti???n Nh???t: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Ph????ng Ti???n ??i l???i Th???i Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C N???u b???n y??u th??ch video, ?????ng qu??n ????ng k?? v?? nh???n v??o n??t \uD83D\uDD14 ????? c???p nh???t nh???ng video m???i nh???t c???a k??nh nha!!!\n" +
                        "?????????????????? C???m ??n b???n ???? xem video v?? quan t??m k??nh ??????????????????" +
                        "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin\n" +
                        "#c??ngngh???m???i\n",
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
                "Top 5 ph??t minh khoa h???c trong phim vi???n t?????ng c?? th???t",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/HxyiRFqo6Y0?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                10898,
                Timestamp.valueOf("2021-11-27 20:00:00.00"),
                "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin",
                "N??i gi???i thi???u nh???ng c??ng ngh??? ?????nh cao m???i nh???t\n" +
                        "\uD83D\uDD14 Theo d??i k??nh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA T???ng h???p PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thi???t B??? Th??ng Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Nh???ng C??ng Ngh??? V?? Trang T??n Ti???n Nh???t: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Ph????ng Ti???n ??i l???i Th???i Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C N???u b???n y??u th??ch video, ?????ng qu??n ????ng k?? v?? nh???n v??o n??t \uD83D\uDD14 ????? c???p nh???t nh???ng video m???i nh???t c???a k??nh nha!!!\n" +
                        "?????????????????? C???m ??n b???n ???? xem video v?? quan t??m k??nh ??????????????????" +
                        "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin\n" +
                        "#c??ngngh???m???i\n",
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
                "??i???m m???t nh???ng s???n ph???m c??ng ngh??? ???n t?????ng nh???t t???i s??? ki???n CES 2021 | 7NCN",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/tHFCrprT6rY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                9111,
                Timestamp.valueOf("2021-01-27 20:00:00.00"),
                "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin",
                "Tri???n l??m ??i???n t??? ti??u d??ng to??n c???u CES ( Consumer Electronic Show ): l?? m???t trong nh???ng s??? ki???n l???n nh???t c???a l??ng c??ng ngh??? th??? gi???i\n" +
                        "N??i gi???i thi???u nh???ng c??ng ngh??? ?????nh cao m???i nh???t\n" +
                        "\uD83D\uDD14 Theo d??i k??nh: https://bit.ly/2K20sv5\n" +
                        "\uD83D\uDCFA T???ng h???p PLAYLIST:\n" +
                        "\uD83D\uDCAB 1001 Thi???t B??? Th??ng Minh: https://bit.ly/2XAiiNm\n" +
                        "\uD83D\uDCAB Nh???ng C??ng Ngh??? V?? Trang T??n Ti???n Nh???t: https://bit.ly/30aCLtP\n" +
                        "\uD83D\uDCAB Ph????ng Ti???n ??i l???i Th???i Nanotechnology: https://bit.ly/3gZufDR\n" +
                        "\uD83D\uDC8C N???u b???n y??u th??ch video, ?????ng qu??n ????ng k?? v?? nh???n v??o n??t \uD83D\uDD14 ????? c???p nh???t nh???ng video m???i nh???t c???a k??nh nha!!!\n" +
                        "?????????????????? C???m ??n b???n ???? xem video v?? quan t??m k??nh ??????????????????" +
                        "#7ngaycongnghe #c??ngngh???t????nglai #c??ngngh???th??ngtin\n" +
                        "#c??ngngh???m???i\n",
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
                "Aug.02 -- Google is making a bigger bet on smartphones by joining rivals Apple Inc. and Samsung Electronics Co. in designing the device???s most critical component in-house: the main processor. Mark Gurman reports on Power On\n",
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
                        "In the book you???ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "?? Twitter | @ColdFusion_TV\n" +
                        "?? Instagram | coldfusiontv\n" +
                        "?? Facebook | https://www.facebook.com/ColdFusionTV\n" +
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
                        "?? Music I produce | http://burnwater.bandcamp.com or \n" +
                        "?? http://www.soundcloud.com/burnwater\n" +
                        "?? https://www.patreon.com/ColdFusion_TV\n" +
                        "?? Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
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
                        "In the book you???ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "?? Twitter | @ColdFusion_TV\n" +
                        "?? Instagram | coldfusiontv\n" +
                        "?? Facebook | https://www.facebook.com/ColdFusionTV\n" +
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
                        "?? Music I produce | http://burnwater.bandcamp.com or \n" +
                        "?? http://www.soundcloud.com/burnwater\n" +
                        "?? https://www.patreon.com/ColdFusion_TV\n" +
                        "?? Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
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
                        "In the book you???ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "?? Twitter | @ColdFusion_TV\n" +
                        "?? Instagram | coldfusiontv\n" +
                        "?? Facebook | https://www.facebook.com/ColdFusionTV\n" +
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
                        "?? Music I produce | http://burnwater.bandcamp.com or \n" +
                        "?? http://www.soundcloud.com/burnwater\n" +
                        "?? https://www.patreon.com/ColdFusion_TV\n" +
                        "?? Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
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
                "The Great Google Crash: The World???s Dependency Revealed",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/vJ1cfb-5pHQ?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1100446,
                Timestamp.valueOf("2020-12-22 20:00:00.00"),
                "",
                "Become smarter in 5 minutes by signing up for free today: https://cen.yt/mbcoldfusion4  - Thanks to Morning Brew for sponsoring today???s video.\n" +
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
                        "In the book you???ll learn the stories of those who invented the things we use everyday and how it all fits together to form our modern world.\n" +
                        "Get the book on Amazon: http://bit.ly/NewThinkingbook\n" +
                        "Get the book on Google Play: http://bit.ly/NewThinkingGooglePlay\n" +
                        "https://newthinkingbook.squarespace.c...\n" +
                        "<br/> \n" +
                        "--- ColdFusion Social Media ---\n" +
                        "?? Twitter | @ColdFusion_TV\n" +
                        "?? Instagram | coldfusiontv\n" +
                        "?? Facebook | https://www.facebook.com/ColdFusionTV\n" +
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
                        "?? Music I produce | http://burnwater.bandcamp.com or \n" +
                        "?? http://www.soundcloud.com/burnwater\n" +
                        "?? https://www.patreon.com/ColdFusion_TV\n" +
                        "?? Collection of music used in videos: https://www.youtube.com/watch?v=YOrJJ...\n" +
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
                        "I hope you will enjoy it! Thank you so much for watching! ???\n" +
                        "<br/> \n" +
                        "??? MY SOCIAL MEDIA AND LINKS!\n" +
                        "??? My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "??? Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "??? Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "??? Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "??? Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "??? MUSIC\n" +
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
                        "You make the world a more beautiful place ???\n" +
                        "<br/> \n" +
                        "Sending you all LOTS of love! \n" +
                        "<br/> \n" +
                        "??? MY SOCIAL MEDIA AND LINKS!\n" +
                        "??? My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "??? Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "??? Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "??? Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "??? Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "??? MUSIC\n" +
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
                        "Thank you so much for watching my video! ??? And thank you for all your comments!! \n" +
                        "Wish I could answer you all to let you know how grateful I am.\n" +
                        "Sending SO much love to all of you! Take care! \n" +
                        "<br/> \n" +
                        "??? MY SOCIAL MEDIA AND LINKS!\n" +
                        "??? My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "??? Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "??? Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "??? Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "??? Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "??? MUSIC\n" +
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
                        "Sending you tons of love! ???\n" +
                        "(AND THANK YOU FOR 3 MILLION SUBS!!!)\n" +
                        "<br/> \n" +
                        "???  Marie's channel: https://www.youtube.com/user/Emlouxo\n" +
                        "???  Ash's channel: https://www.youtube.com/user/MadForBi...\n" +
                        "???  Adrian's channel: https://www.youtube.com/channel/UCKst...\n" +
                        "<br/> \n" +
                        "??? Jonas video from our adventure in in mountains: https://www.youtube.com/watch?v=Bhc9u...\n" +
                        "<br/> \n" +
                        "??? MY SOCIAL MEDIA AND LINKS\n" +
                        "??? My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "??? Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "??? Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "??? Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "??? Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "??? MUSIC\n" +
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
                        "Thank you so much for watching this and being here ! Sending you tons of love! ???\n" +
                        "<br/> \n" +
                        "??? MY SOCIAL MEDIA AND LINKS\n" +
                        "??? My Art & Jewelry Webshop: https://jonnajintonsweden.com\n" +
                        "??? Instagram: @jonnajinton  http://www.instagram.com/jonnajinton\n" +
                        "??? Wallpaper collection: https://www.photowall.com/designers/j...\n" +
                        "??? Facebook Page - http://www.facebook.com/jonnajinton\n" +
                        "??? Blog: https://jonnajintonsweden.com/blog/\n" +
                        "<br/> \n" +
                        "??? MUSIC\n" +
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
                "V??? ?????p c???a m???t cu???c s???ng b??nh th?????ng - m???ng x?? h???i v?? cu???c s???ng gi???n d???",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/7H3D-6nj_dY?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                1562657,
                Timestamp.valueOf("2020-06-17 20:00:00.00"),
                "",
                "H??m nay t??i mu???n chia s??? m???t s??? kinh nghi???m v?? c???m nh???n c???a m??nh v??? m???ng x?? h???i, c??ng nh?? nh???ng l???i ??ch v?? th??ch th???c li??n quan ?????n n??.\n" +
                        "T??i c??ng mu???n chia s??? l?? do t???i sao t??i ch??? chia s??? m???t s??? kh??a c???nh c???a cu???c s???ng v?? s??? ri??ng t?? quan tr???ng nh?? th??? n??o ?????i v???i t??i, ?????c bi???t l?? ?????i v???i c??c m???i quan h??? c???a t??i. K??nh n??y s??? lu??n l?? thi??n ???????ng ngh??? thu???t c???a ??nh s??ng v?? h??a b??nh, ???????c nh??n qua l??ng k??nh s??ng t???o nh???m l??m n???i b???t v??? ?????p nh?? tranh v??? c???a ?????i th?????ng v?? h??ng ng??y.\n" +
                        "T??n t??i l?? Paola, t??i l?? ng?????i M??? g???c Puerto Rico, 24 tu???i v?? hi???n ??ang t??? kinh doanh t???i Bang Washington. C???m ??n b???n v?? t???t c??? nh???ng b??nh lu???n ????ng y??u c???a b???n, n?? ???????c ????nh gi?? cao ??????\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8A\uD83C\uDF44My Etsy Shop: https://www.etsy.com/shop/thecottagef...\n" +
                        "<br/> \n" +
                        "?????? Kh??ng c?? ngh??a v??? g??, nh??ng n???u b???n mu???n ????ng g??p ????? ???ng h??? k??nh n??y. $ 5 s??? nh???n ???????c m???t t???m b??u thi???p c???m ??n (ngh??? thu???t c???a ri??ng t??i) t??? t??i trong th?? (b???n ph???i ghi ?????a ch??? trong ghi ch?? c???a m??nh ????? t??i c?? th??? g???i n??!). N?? ???????c ????nh gi?? cao: https://www.paypal.com/donate?hosted_...\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8BInstagram: https://www.instagram.com/the_cottage...\n" +
                        "<br/> \n" +
                        "\uD83C\uDF0C Video n??y ???????c th???c hi???n v???i anh trai c???a t??i! Anh ???y c?? m???t k??nh b??y gi???! https://linktr.ee/rohan_merrill\n" +
                        "<br/> \n" +
                        "Ngu???n c???m h???ng c??ng th???c (T??i ???? l??m b??nh n?????ng x???p thay v?? b??nh n?????ng nh???, nh??ng t??i c?? r???ng b??nh n?????ng nh??? th???m ch?? c??n ngon h??n): https://www.acozykitchen.com/chamomil...\n" +
                        "<br/> \n" +
                        "C??nh hoa h???ng c?? k???o: https://leitesculinaria.com/104920/re...\n" +
                        "<br/> \n" +
                        "2 cu???n s??ch y??u th??ch c???a t??i v??? th???o m???c, th???c ph???m hoang d?? v?? ki???m ??n (t??i ???? h???c ???????c r???t nhi???u ??i???u t??? nh???ng cu???n s??ch n??y! Ch??ng r???t d??? hi???u, ???????c ch???p ???nh v?? vi???t ?????p m???t):\n" +
                        "<br/> \n" +
                        "    1. Wild Remedies c???a Rosalee de la Foret\n" +
                        "Hi???u s??ch: shorturl.at/akAHO\n" +
                        "Amazon: https://amzn.to/35rGZzH \n" +
                        "    2. Alchemy of Herbs c???a Rosalee de la Foret\n" +
                        "Hi???u s??ch: shorturl.at/eIKSU\n" +
                        "Amazon: https://amzn.to/2JRuXaa\n" +
                        "    3. Cu???n s??ch y??u th??ch c???a t??i v??? pha tr??: https://amzn.to/3cJQWud\n" +
                        "<br/> \n" +
                        "M???t s??? trong nhi???u cu???n s??ch y??u th??ch:\n" +
                        "<br/> \n" +
                        "1. \"C???u b??, chu???t ch??i, c??o v?? ng???a\" c???a Charlie Mackesy: https://amzn.to/348of6g\n" +
                        "2. Once Upon a River c???a Diane Setterfield:\n" +
                        "https://amzn.to/3kp1a5e\n" +
                        "3. ?????a tr??? tuy???t c???a Eowyn Ivey\n" +
                        "Amazon: https://amzn.to/32B2ITM\n" +
                        "<br/> \n" +
                        "Gi???y ph??p Artlist c??? th???\n" +
                        "S??? gi???y ph??p - 578124 Ch??? s??? h???u gi???y ph??p - Rohan B. Merrill\n" +
                        "<br/> \n" +
                        "Nh???c b??? sung ???????c t??m th???y t???i @\n" +
                        "https://www.epidemicsound.com/referra...\n" +
                        "(Nh???n mi???n ph?? m???t th??ng v???i m?? gi???i thi???u c???a t??i)\n" +
                        "<br/> \n" +
                        "M???t s??? li??n k???t ??? tr??n c?? th??? l?? li??n k???t, ngh??a l?? t??i nh???n ???????c m???t kho???n hoa h???ng nh???\n",
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
                "The Cost of Rural Cottage Life - being honest with myself, looking for a ???quick fix???",
                "<iframe width=\"560\" height=\"315\" src=\"https://youtube.com/embed/OHucv0YV9c4?autoplay=1\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>",
                189165,
                Timestamp.valueOf("2020-10-28 20:00:00.00"),
                "",
                "The Cost of Rural Cottage Life - being honest with myself, looking for a ???quick fix???\n" +
                        "<br/> \n" +
                        "More details below?????? \n" +
                        "<br/> \n" +
                        "\uD83E\uDDF9Broom DIY: https://www.motherearthnews.com/diy/t...\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8A\uD83C\uDF44My Etsy Shop: https://www.etsy.com/shop/thecottagef... (I am closing in late November for the rest of 2021! Thank you\uD83D\uDE0A )\n" +
                        "<br/> \n" +
                        "??????No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...\n" +
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
                        "??????Take Action: https://www.sierraclub.org/take-action\n" +
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
                        "- While this isn???t budgeting related, I do love to patronize artists and creators that make work that speak to me. I recently tried to purchase all my Christmas gifts from small businesses. I find it a very meaningful way to connect with other artists.\n" +
                        "- I find I naturally spend less due to not being exposed to as many advertisements on billboards/magazines/internet. I had never realized how much these ads influenced my spending until I moved. Another way I limit this is by pre-downloading tv shows and audiobooks and having set times to use social media, as I do not have wifi at home.   \n" +
                        "- I try to educate myself on financial management as much as possible, prioritizing health insurance if possible and trying to prepare for retirement (even if it???s only a tiny contribution). I know this isn???t always possible for everyone, but the more I learn the more I realized how important it is. \n" +
                        "<br/> \n" +
                        "As I mentioned before, when I first started considering a transition over here I was 21. I eventually did get assistance from my family in order to start a new job. On the internet I notice there are a surprising amount of individuals who find it shameful to get support from others as a young person, but I do not believe that is true. While it is definitely an incredible blessing to have parents that can help you relocate, one that I am very grateful for, there is absolutely nothing wrong with accepting help if you need it (from anyone, not simply family). I have never met anyone who hasn???t received help from someone else during some time in their lives, I think it???s beautiful to build bonds and relationships in this way as long as it???s done with honor and respect for others.\n" +
                        "<br/> \n" +
                        "If there is one thing I???ve found empowering, is finding practical ways to work towards your dreams. Every if it???s baby steps, you can clearly see the progress you are making and feel very motivated to keep working towards your goals.\n",
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
                        "It was time for a change. I have found myself not feeling as satisfied with my current work situation, I lacked a feeling of purpose that I always had before when working with children. As it???s tricky simply to start a new job short notice, so I will be working in town for the next several months as holiday help and plan from there. It is a much needed shift to a more social environment, and hopefully a greater work/life balance. I find it very hard to divide work from personal life at home, so I think this will have a wonderful affect on my mental health as well.\n" +
                        "<br/> \n" +
                        "In this video I am sharing some less-than-ideal aspects of living rurally (for me, it may not be the case for someone else). In connection, I wanted to explain why I do not live off grid, and what downsides you may - perhaps - face if you do (which is the reason I live near town). I forgot to mention that I do not have the wish, time to commit, nor the funds to live off grid. It can be very expensive to buy land, build a house, and set up a survival system. I only rent my cottage and am not yet in the position to buy a home, much less build one (the lumber prices lately are insane!). Most people I personally know who live off grid in my valley work remotely so that they can have a flexible schedule, and that is something that I certainly cannot do with my current job. Hope that clarifies things for anyone who was curious! Thank you very much \n" +
                        "<br/> \n" +
                        "??????No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...\n" +
                        "NOTE: now and then a postcard has been returned to me or lost in the mail. If you have not received a postcard e-mail me at endymionmerrill@gmail.com! I send them out each month! Thank you!\n" +
                        "<br/> \n" +
                        "\uD83E\uDD8BInstagram: https://www.instagram.com/the_cottage...\n" +
                        "<br/> \n" +
                        "\uD83C\uDF0C This video was a collaboration with my brother, Rohan. He has a channel now! https://linktr.ee/rohan_merrill\n" +
                        "<br/> \n" +
                        "Information and conservation efforts in the beautiful Okanogan County: https://methowconservancy.org\n" +
                        "\uD83C\uDF0E Take action to protect our lands (no donations necessary): https://www.audubon.org/takeaction\n" +
                        "\uD83C\uDF19 My favorite charity: https://www.nrdc.org \n" +
                        "??????Take Action: https://www.sierraclub.org/take-action\n" +
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
                        "?????? No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...      \n" +
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
                "???this is where I live??? \n" +
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
                        "?????? No obligation whatsoever, but if you would like to donate to support this channel. $5 will get a thank you postcard (my own art) from me in the mail (you must include address in your note so I can send it!). It is much appreciated: https://www.paypal.com/donate?hosted_...      \n" +
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
                "Kh??nh Vy OFFICIAL",
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
                "7 Ng??y C??ng Ngh??? ",
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
                "B??o Tu???i Tr??? ",
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
                "G???u B??o V???ng V???",
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
                "H?? Khu???t",
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
