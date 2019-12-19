package cn.edu.zjut.weining.toutiao.spider.toutiao;

import java.util.List;

public class ToutiaoC1Json {
    private int total_number;
    private int ban_pic_comment;
    private boolean ban_face;
    private int go_topic_detail;
    private List<DataEntity> data;
    private Repost_paramsEntity repost_params;
    private String message;
    private boolean stick_has_more;
    private int fold_comment_count;
    private boolean ban_comment;
    private int show_add_forum;
    private Tab_infoEntity tab_info;
    private int stick_total_number;
    private int detail_no_comment;
    private boolean stable;
    private boolean has_more;
    private int ban_gif_suggest;
    private List<?> stick_comments;
    private GroupEntity group;

    public void setTotal_number(int total_number) { this.total_number = total_number; }



    public void setBan_pic_comment(int ban_pic_comment) { this.ban_pic_comment = ban_pic_comment; }



    public void setBan_face(boolean ban_face) { this.ban_face = ban_face; }



    public void setGo_topic_detail(int go_topic_detail) { this.go_topic_detail = go_topic_detail; }



    public void setData(List<DataEntity> data) { this.data = data; }



    public void setRepost_params(Repost_paramsEntity repost_params) { this.repost_params = repost_params; }



    public void setMessage(String message) { this.message = message; }



    public void setStick_has_more(boolean stick_has_more) { this.stick_has_more = stick_has_more; }



    public void setFold_comment_count(int fold_comment_count) { this.fold_comment_count = fold_comment_count; }



    public void setBan_comment(boolean ban_comment) { this.ban_comment = ban_comment; }



    public void setShow_add_forum(int show_add_forum) { this.show_add_forum = show_add_forum; }



    public void setTab_info(Tab_infoEntity tab_info) { this.tab_info = tab_info; }



    public void setStick_total_number(int stick_total_number) { this.stick_total_number = stick_total_number; }



    public void setDetail_no_comment(int detail_no_comment) { this.detail_no_comment = detail_no_comment; }



    public void setStable(boolean stable) { this.stable = stable; }



    public void setHas_more(boolean has_more) { this.has_more = has_more; }



    public void setBan_gif_suggest(int ban_gif_suggest) { this.ban_gif_suggest = ban_gif_suggest; }



    public void setStick_comments(List<?> stick_comments) { this.stick_comments = stick_comments; }



    public void setGroup(GroupEntity group) { this.group = group; }



    public int getTotal_number() { return this.total_number; }



    public int getBan_pic_comment() { return this.ban_pic_comment; }



    public boolean isBan_face() { return this.ban_face; }



    public int getGo_topic_detail() { return this.go_topic_detail; }



    public List<DataEntity> getData() { return this.data; }



    public Repost_paramsEntity getRepost_params() { return this.repost_params; }



    public String getMessage() { return this.message; }



    public boolean isStick_has_more() { return this.stick_has_more; }



    public int getFold_comment_count() { return this.fold_comment_count; }



    public boolean isBan_comment() { return this.ban_comment; }



    public int getShow_add_forum() { return this.show_add_forum; }



    public Tab_infoEntity getTab_info() { return this.tab_info; }



    public int getStick_total_number() { return this.stick_total_number; }



    public int getDetail_no_comment() { return this.detail_no_comment; }



    public boolean isStable() { return this.stable; }



    public boolean isHas_more() { return this.has_more; }



    public int getBan_gif_suggest() { return this.ban_gif_suggest; }



    public List<?> getStick_comments() { return this.stick_comments; }



    public GroupEntity getGroup() { return this.group; }



    public class DataEntity
    {
        private String embedded_data;


        private String ad;

        private CommentEntity comment;

        private long id;

        private int cell_type;


        public void setEmbedded_data(String embedded_data) { this.embedded_data = embedded_data; }



        public void setAd(String ad) { this.ad = ad; }



        public void setComment(CommentEntity comment) { this.comment = comment; }



        public void setId(long id) { this.id = id; }



        public void setCell_type(int cell_type) { this.cell_type = cell_type; }



        public String getEmbedded_data() { return this.embedded_data; }



        public String getAd() { return this.ad; }



        public CommentEntity getComment() { return this.comment; }



        public long getId() { return this.id; }



        public int getCell_type() { return this.cell_type; }



        public class CommentEntity
        {
            private String user_name;


            private int interact_style;

            private int user_relation;

            private String user_auth_info;

            private int forward_count;

            private String platform;

            private double score;

            private String user_profile_image_url;

            private List<Reply_listEntity> reply_list;

            private int bury_count;

            private String id_str;

            private int is_pgc_author;

            private String verified_reason;

            private long id;

            private String text;

            private int has_author_digg;

            private String large_image_list;

            private boolean user_verified;

            private String content_rich_span;

            private int create_time;

            private String user_decoration;

            private int is_followed;

            private int reply_count;

            private int user_digg;

            private List<?> author_badge;

            private String tags;

            private int is_blocked;

            private List<?> author_badge_night;

            private Media_infoEntity media_info;

            private String thumb_image_list;

            private int digg_count;

            private long user_id;

            private int is_blocking;

            private int user_bury;

            private String remark_name;

            private int is_following;

            private int aid;


            public void setUser_name(String user_name) { this.user_name = user_name; }



            public void setInteract_style(int interact_style) { this.interact_style = interact_style; }



            public void setUser_relation(int user_relation) { this.user_relation = user_relation; }



            public void setUser_auth_info(String user_auth_info) { this.user_auth_info = user_auth_info; }



            public void setForward_count(int forward_count) { this.forward_count = forward_count; }



            public void setPlatform(String platform) { this.platform = platform; }



            public void setScore(double score) { this.score = score; }



            public void setUser_profile_image_url(String user_profile_image_url) { this.user_profile_image_url = user_profile_image_url; }



            public void setReply_list(List<Reply_listEntity> reply_list) { this.reply_list = reply_list; }



            public void setBury_count(int bury_count) { this.bury_count = bury_count; }



            public void setId_str(String id_str) { this.id_str = id_str; }



            public void setIs_pgc_author(int is_pgc_author) { this.is_pgc_author = is_pgc_author; }



            public void setVerified_reason(String verified_reason) { this.verified_reason = verified_reason; }



            public void setId(long id) { this.id = id; }



            public void setText(String text) { this.text = text; }



            public void setHas_author_digg(int has_author_digg) { this.has_author_digg = has_author_digg; }



            public void setLarge_image_list(String large_image_list) { this.large_image_list = large_image_list; }



            public void setUser_verified(boolean user_verified) { this.user_verified = user_verified; }



            public void setContent_rich_span(String content_rich_span) { this.content_rich_span = content_rich_span; }



            public void setCreate_time(int create_time) { this.create_time = create_time; }



            public void setUser_decoration(String user_decoration) { this.user_decoration = user_decoration; }



            public void setIs_followed(int is_followed) { this.is_followed = is_followed; }



            public void setReply_count(int reply_count) { this.reply_count = reply_count; }



            public void setUser_digg(int user_digg) { this.user_digg = user_digg; }



            public void setAuthor_badge(List<?> author_badge) { this.author_badge = author_badge; }



            public void setTags(String tags) { this.tags = tags; }



            public void setIs_blocked(int is_blocked) { this.is_blocked = is_blocked; }



            public void setAuthor_badge_night(List<?> author_badge_night) { this.author_badge_night = author_badge_night; }



            public void setMedia_info(Media_infoEntity media_info) { this.media_info = media_info; }



            public void setThumb_image_list(String thumb_image_list) { this.thumb_image_list = thumb_image_list; }



            public void setDigg_count(int digg_count) { this.digg_count = digg_count; }



            public void setUser_id(long user_id) { this.user_id = user_id; }



            public void setIs_blocking(int is_blocking) { this.is_blocking = is_blocking; }



            public void setUser_bury(int user_bury) { this.user_bury = user_bury; }



            public void setRemark_name(String remark_name) { this.remark_name = remark_name; }



            public void setIs_following(int is_following) { this.is_following = is_following; }



            public void setAid(int aid) { this.aid = aid; }



            public String getUser_name() { return this.user_name; }



            public int getInteract_style() { return this.interact_style; }



            public int getUser_relation() { return this.user_relation; }



            public String getUser_auth_info() { return this.user_auth_info; }



            public int getForward_count() { return this.forward_count; }



            public String getPlatform() { return this.platform; }



            public double getScore() { return this.score; }



            public String getUser_profile_image_url() { return this.user_profile_image_url; }



            public List<Reply_listEntity> getReply_list() { return this.reply_list; }



            public int getBury_count() { return this.bury_count; }



            public String getId_str() { return this.id_str; }



            public int getIs_pgc_author() { return this.is_pgc_author; }



            public String getVerified_reason() { return this.verified_reason; }



            public long getId() { return this.id; }



            public String getText() { return this.text; }



            public int getHas_author_digg() { return this.has_author_digg; }



            public String getLarge_image_list() { return this.large_image_list; }



            public boolean isUser_verified() { return this.user_verified; }



            public String getContent_rich_span() { return this.content_rich_span; }



            public int getCreate_time() { return this.create_time; }



            public String getUser_decoration() { return this.user_decoration; }



            public int getIs_followed() { return this.is_followed; }



            public int getReply_count() { return this.reply_count; }



            public int getUser_digg() { return this.user_digg; }



            public List<?> getAuthor_badge() { return this.author_badge; }



            public String getTags() { return this.tags; }



            public int getIs_blocked() { return this.is_blocked; }



            public List<?> getAuthor_badge_night() { return this.author_badge_night; }



            public Media_infoEntity getMedia_info() { return this.media_info; }



            public String getThumb_image_list() { return this.thumb_image_list; }



            public int getDigg_count() { return this.digg_count; }



            public long getUser_id() { return this.user_id; }



            public int getIs_blocking() { return this.is_blocking; }



            public int getUser_bury() { return this.user_bury; }



            public String getRemark_name() { return this.remark_name; }



            public int getIs_following() { return this.is_following; }



            public int getAid() { return this.aid; }



            public class Reply_listEntity
            {
                private String content_rich_span;


                private String user_name;

                private String user_auth_info;

                private int is_followed;

                private int user_digg;

                private List<?> author_badge;

                private String user_profile_image_url;

                private List<?> author_badge_night;

                private int is_blocked;

                private long user_id;

                private int digg_count;

                private int is_pgc_author;

                private int is_blocking;

                private long id;

                private String text;

                private int is_following;

                private boolean user_verified;


                public void setContent_rich_span(String content_rich_span) { this.content_rich_span = content_rich_span; }



                public void setUser_name(String user_name) { this.user_name = user_name; }



                public void setUser_auth_info(String user_auth_info) { this.user_auth_info = user_auth_info; }



                public void setIs_followed(int is_followed) { this.is_followed = is_followed; }



                public void setUser_digg(int user_digg) { this.user_digg = user_digg; }



                public void setAuthor_badge(List<?> author_badge) { this.author_badge = author_badge; }



                public void setUser_profile_image_url(String user_profile_image_url) { this.user_profile_image_url = user_profile_image_url; }



                public void setAuthor_badge_night(List<?> author_badge_night) { this.author_badge_night = author_badge_night; }



                public void setIs_blocked(int is_blocked) { this.is_blocked = is_blocked; }



                public void setUser_id(long user_id) { this.user_id = user_id; }



                public void setDigg_count(int digg_count) { this.digg_count = digg_count; }



                public void setIs_pgc_author(int is_pgc_author) { this.is_pgc_author = is_pgc_author; }



                public void setIs_blocking(int is_blocking) { this.is_blocking = is_blocking; }



                public void setId(long id) { this.id = id; }



                public void setText(String text) { this.text = text; }



                public void setIs_following(int is_following) { this.is_following = is_following; }



                public void setUser_verified(boolean user_verified) { this.user_verified = user_verified; }



                public String getContent_rich_span() { return this.content_rich_span; }



                public String getUser_name() { return this.user_name; }



                public String getUser_auth_info() { return this.user_auth_info; }



                public int getIs_followed() { return this.is_followed; }



                public int getUser_digg() { return this.user_digg; }



                public List<?> getAuthor_badge() { return this.author_badge; }



                public String getUser_profile_image_url() { return this.user_profile_image_url; }



                public List<?> getAuthor_badge_night() { return this.author_badge_night; }



                public int getIs_blocked() { return this.is_blocked; }



                public long getUser_id() { return this.user_id; }



                public int getDigg_count() { return this.digg_count; }



                public int getIs_pgc_author() { return this.is_pgc_author; }



                public int getIs_blocking() { return this.is_blocking; }



                public long getId() { return this.id; }



                public String getText() { return this.text; }



                public int getIs_following() { return this.is_following; }



                public boolean isUser_verified() { return this.user_verified; }
            }



            public class Media_infoEntity
            {
                private String avatar_url;


                private String name;


                public void setAvatar_url(String avatar_url) { this.avatar_url = avatar_url; }



                public void setName(String name) { this.name = name; }



                public String getAvatar_url() { return this.avatar_url; }



                public String getName() { return this.name; }
            }
        }
    }



    public class Repost_paramsEntity
    {
        private String schema;


        private int repost_type;

        private String cover_url;

        private int fw_id_type;

        private long fw_user_id;

        private String title;

        private long fw_id;


        public void setSchema(String schema) { this.schema = schema; }



        public void setRepost_type(int repost_type) { this.repost_type = repost_type; }



        public void setCover_url(String cover_url) { this.cover_url = cover_url; }



        public void setFw_id_type(int fw_id_type) { this.fw_id_type = fw_id_type; }



        public void setFw_user_id(long fw_user_id) { this.fw_user_id = fw_user_id; }



        public void setTitle(String title) { this.title = title; }



        public void setFw_id(long fw_id) { this.fw_id = fw_id; }



        public String getSchema() { return this.schema; }



        public int getRepost_type() { return this.repost_type; }



        public String getCover_url() { return this.cover_url; }



        public int getFw_id_type() { return this.fw_id_type; }



        public long getFw_user_id() { return this.fw_user_id; }



        public String getTitle() { return this.title; }



        public long getFw_id() { return this.fw_id; }
    }



    public class Tab_infoEntity
    {
        private List<String> tabs;


        private int current_tab_index;


        public void setTabs(List<String> tabs) { this.tabs = tabs; }



        public void setCurrent_tab_index(int current_tab_index) { this.current_tab_index = current_tab_index; }



        public List<String> getTabs() { return this.tabs; }



        public int getCurrent_tab_index() { return this.current_tab_index; }
    }



    public class GroupEntity
    {
        private String content_rich_span;


        private boolean is_video;

        private long user_id;

        private String user_name;

        private String content;


        public void setContent_rich_span(String content_rich_span) { this.content_rich_span = content_rich_span; }



        public void setIs_video(boolean is_video) { this.is_video = is_video; }



        public void setUser_id(long user_id) { this.user_id = user_id; }



        public void setUser_name(String user_name) { this.user_name = user_name; }



        public void setContent(String content) { this.content = content; }



        public String getContent_rich_span() { return this.content_rich_span; }



        public boolean isIs_video() { return this.is_video; }



        public long getUser_id() { return this.user_id; }



        public String getUser_name() { return this.user_name; }



        public String getContent() { return this.content; }
    }
}
