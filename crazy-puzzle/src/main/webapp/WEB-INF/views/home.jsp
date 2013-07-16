<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Crazy Puzzle</title>
<link rel="stylesheet" title="Sunburst" href="http://script.aculo.us/github/styles/sunburst.css" />
<style>
#puzzle { width:470px; }
.congrats { color: #fff; background: #080 }
</style>
</head>
<body>
<h1>
	Crazy Puzzle
</h1>

<P>  The time on the server is ${serverTime}. </P>
<script type="text/javascript" src="http://script.aculo.us/prototype.js"></script>
<script type="text/javascript" src="http://script.aculo.us/scriptaculous.js"></script>
<div id="puzzle" style="width: 470px">
<img id="image_5" src="/crazypuzzle/resources/images/puzzle5.jpg" alt="" />
<img id="image_1" src="/crazypuzzle/resources/images/puzzle1.jpg" alt="" />
<img id="image_9" src="/crazypuzzle/resources/images/puzzle9.jpg" alt="" />
<img id="image_7" src="/crazypuzzle/resources/images/puzzle7.jpg" alt="" />
<img id="image_4" src="/crazypuzzle/resources/images/puzzle4.jpg" alt="" />
<img id="image_8" src="/crazypuzzle/resources/images/puzzle8.jpg" alt="" />
<img id="image_3" src="/crazypuzzle/resources/images/puzzle3.jpg" alt="" />
<img id="image_6" src="/crazypuzzle/resources/images/puzzle6.jpg" alt="" />
<img id="image_2" src="/crazypuzzle/resources/images/puzzle2.jpg" alt="" />
</div>
<p>
<span id="puzzleinfo">(no move made yet)</span>
</p>
<script type="text/javascript">
(function(){ 
  var p = $('puzzle'), info = $('puzzleinfo'), moves = 0;
  
  Sortable.create('puzzle', {
    tag:'img',overlap:'horizontal',constraint: false,
    onUpdate:function(){
      info.update('You\'ve made ' + (++moves) + ' move' + (moves>1 ? 's' : ''));
      if(Sortable.sequence('puzzle').join('')=='123456789') {
         info.update('You\'ve solved the puzzle in ' + moves + ' moves!').morph('congrats');
         xmlhttp=new XMLHttpRequest();
         xmlhttp.open("GET","/crazypuzzle/save?moves="+moves,false);
         xmlhttp.send();
         xmlDoc=xmlhttp.responseXML;
      }
    }
  });
})();
</script>

<script type="text/javascript" src="http://script.aculo.us/github/highlight.js"></script><script type="text/javascript">
  hljs.initHighlightingOnLoad.apply(null, hljs.ALL_LANGUAGES);
</script>

<hr/>
<H2> Hall of Fame </H2>
<c:forEach var="score" items="${scores}">
  <li> ${score} </li>
</c:forEach>
</body>
</html>
