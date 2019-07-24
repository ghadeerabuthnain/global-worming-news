# global-worming-news
a java spring api where you can post and comment about global worming


[![HitCount](http://hits.dwyl.io/lamoboos223/global-worming-news.svg)](http://hits.dwyl.io/lamoboos223/global-worming-news)
[![Join the chat at https://gitter.im/slitherine/global-warming-spring-boot-api](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/slitherine/global-warming-spring-boot-api?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/lamoboos223/global-worming-news/issues)




## Class Diagram
![](https://github.com/lamoboos223/global-worming-news/blob/master/Untitled.jpg)

<!-- script for generating class diagram on: https://creately.com/app/?tempID=h165rwt81&login_type=demo#
1. this is for POST:

Post
\n
--
\n
+ id: int
+ text : string
- createdDate: LocalDateTime
\n
--
\n
+ getAllPost (  ) : return List<post>
+ getPostById ( int id ) : return post
+ addPost ( post newPost ) : return post
\n

2. this is for COMMENT

Comment
\n
--
\n
+ id: int
+ text : string
+ createdDate: LocalDateTime
+ postId: post
\n
--
\n
+ addComment ( comment newComment ) : return comment
+ deleteComment( int id ) : void
\n
// This is a comment
// (--) This is a section break
// Line break (\n) enter in-between text for line break
-->
