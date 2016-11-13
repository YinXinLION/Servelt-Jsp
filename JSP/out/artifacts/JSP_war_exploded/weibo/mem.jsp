<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-27
  Time: 下午11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = (String) request.getSession().getAttribute("login");
    String imageuri = "/images/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="/images/lala.css">
</head>
<body>
<div id="header">
    <div id="logo">
        <img src="<%=imageuri%>5.png">
    </div>
    <div id="search">
        <input type="text" name="" />
        <input type="submit" name="" value="搜索">
    </div>
    <div id="weibo">
        <p align="center"><%= username%></p>
    </div>
    <div class="nav"> <!--  头导航区的div -->
        <ul>
            <li><a href="#">首页</a></li>
            <li><a href="#">视频</a></li>
            <li><a href="#">发现</a></li>
            <li><a href="#">游戏</a></li>
            <li><%=username%></li>
        </ul>
    </div>
</div>
<div id="content">
    <!-- 左导航的最外层的div -->
    <div class="leftnav">
        <ul>
            <li><a href="#">首页</a></li>
            <li><a href="#">我的收藏</a></li>
            <li><a href="#">我的赞</a></li>
            <li><a href="#">热门微博</a></li>
            <li><a href="#">好友圈</a></li>
            <li><a href="#">特别关注</a></li>
            <li><a href="#">同学</a></li>
            <li><a href="#">明星</a></li>
            <li><a href="#">企业</a></li>
            <li><a href="#">其他</a></li>

        </ul>
    </div>


    <div class="mid_main">
        <div class="put_info">
            <form method="post" action="message.do">
                <img src="<%=imageuri%>3.png">
                <textarea cols="90" rows="8">

						</textarea><br>
                <input type="submit" name="" value="发布">
            </form>
        </div>
        <div class="news">
            <div class="news_one">
                <%
                    Connection conn = null;
                    Statement st = null;
                    ResultSet rs = null;

                    //如果image 不是空打印照片, 否则不打印
                %>
                <img src="<%=imageuri%>1.jpg">
                <p>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制衡：纵横捭阖，自有制衡之道/不急，吾等必一击制敌
                    救援：不愧是朕的左臂右膀/得此良将，甚慰朕心
                    阵亡：父兄大绩，权失憾矣！
                    制衡：纵横捭阖，自有制衡之道/不急，吾等必一击制敌
                    救援：不愧是朕的左臂右膀/得此良将，甚慰朕心
                    阵亡：父兄大绩，权失憾矣！
                    制衡：纵横捭阖，自有制衡之道/不急，吾等必一击制敌
                    救援：不愧是朕的左臂右膀/得此良将，甚慰朕心
                    阵亡：父兄大绩，权失憾矣！
                    制衡：纵横捭阖，自有制衡之道/不急，吾等必一击制敌
                    救援：不愧是朕的左臂右膀/得此良将，甚慰朕心
                    阵亡：父兄大绩，权失憾矣！
                    救援：不愧是朕的左臂右膀/得此良将，甚慰朕心
                    阵亡：父兄大绩，权失憾矣！
                </p>

            </div>

            <div class="line">
                <ul>
                    <li>收藏</li>
                    <li>转发</li>
                    <li>评论</li>
                    <li>赞</li>
                </ul>
            </div>
            <hr>
        </div>

        <div class="news">
            <p>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一别都门三改火，天涯踏尽红尘。依然一笑作春温。无波真古井，有节是秋筠。惆怅孤帆连夜发，送行淡月微云。尊前不用翠眉颦。人生如逆旅，我亦是行人。——《临江仙》苏轼
            </p>
            <div class="line">
                <ul>
                    <li>收藏</li>
                    <li>转发</li>
                    <li>评论</li>
                    <li>赞</li>
                </ul>
            </div>
            <hr>

        </div>

        <div class="news">
            <p>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;You have your way. I have my way. As for the right way, the correct way, and the only way, it does not exist.  你有你的路。我有我的路。至于适当的路，正确的路和唯一的路，这样的路并不存在。  ——尼采
            </p>
            <div class="line">
                <ul>
                    <li>收藏</li>
                    <li>转发</li>
                    <li>评论</li>
                    <li>赞</li>
                </ul>
            </div>
            <hr>
        </div>

        <div class="news">
            <p>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;风，突然没有了声音，我渐渐地什么也看不见，只听见屠宰房里骆驼嘶叫的悲鸣越来越响，越来越高，整个的天空，渐渐充满了骆驼们哭泣着的巨大的回声，像雷鸣似的向我罩下来。 ——三毛《撒哈拉的故事》
            </p>
            <div class="line">
                <ul>
                    <li>收藏</li>
                    <li>转发</li>
                    <li>评论</li>
                    <li>赞</li>
                </ul>
            </div>
        </div>

    </div>



    <div id="right">
        <div class="user">
            <div class="advertisement">
                <img src="<%=imageuri%>7.jpg" >
            </div>
            <div class="user_info">

                <a href="#">关注&nbsp;&nbsp;0&nbsp;&nbsp;&nbsp;&nbsp;|</a>
                <a href="#">粉丝&nbsp;&nbsp;0&nbsp;&nbsp;|</a>
                <a href="#">微博&nbsp;&nbsp;0</a>
            </div>
        </div>

        <div class="top1">
            <h4>亚洲新歌榜实时趋势</h4>
            <hr>
            <div class="ting">
                <img src="/images/1234.jpg">
                <div class="li">
                    <div class="hong1">1</div>
                    <span>从你的全世界路过</span>
                    <p>
                        邓超<br>
                        4564944分
                    </p>
                </div>
            </div><hr>

            <p><div class="hong">1</div>全世界谁倾听你</p><img class="two" src="/images/2.png"><hr>
            <p><div class="hong">2</div>你在终点等我</p><img class="two" src="/images/2.png"><hr>
            <p><div class="hong">3</div>公主披风</p><img class="two" src="/images/2.png"><hr>
            <h5><a href="#">see more&nbsp;></a></h5>
        </div>

        <div class="top2">
            <div class="top2_main">
                <h4>热门话题</h4>
                <hr>
                <ul>
                    <li><a href="">#李云迪波兰生日音乐会#</a><p>78万</p></li>
                    <li><a href="#">#全家好拍档#</a><p>1.4万</p></li>
                    <li><a href="#">#候机的痛苦#</a><p>7604</p></li>
                    <li><a href="#">#王俊凯长城纽约行#</a><p>1.3万</p></li>
                    <li><a href="#">#玛法达星座周运#</a><p>9845</p></li>
                    <li><a href="#">#女测男测#</a><p>5.6万</p></li>
                    <li><a href="#">#12星座结婚狂#</a><p>7.7万</p></li>
                    <li><a href="#">#玛法达星座周运#</a><p>9845</p></li>
                    <li><a href="#">#候机的痛苦#</a><p>7604</p></li>
                </ul>

            </div>

        </div>
    </div>
</div>
<div class="banquan">
    <p>
        版权所有：***************|联系我们<br>
        ICP备 ************<br>
        全程技术支持：***********
    </p>
</div>
</body>
</html>