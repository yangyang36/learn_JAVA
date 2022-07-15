create table Video (
  videoID int auto_increment primary key,
  videoName varchar(50) null,
  price int null,
  constraint Video_videoID_uindex unique(videoID)
)
