# global-worming-news
a java spring api where you can post and comment about global worming


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
