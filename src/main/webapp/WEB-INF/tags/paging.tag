<%@ tag language="java" pageEncoding="ISO-8859-1" %>
<%@ tag import ="org.springframework.util.StringUtils" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ attribute name="pagedListHolder" required="true"
	 type="org.springframework.beans.support.PagedListHolder" %>
	 
<%@ attribute name="pagedLink" required="true" type="java.lang.String" %>

	<link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.theme.css" rel="stylesheet">

    <!-- theme stylesheet -->
    <link href="css/style.default.css" rel="stylesheet" id="theme-stylesheet">

    <!-- your stylesheet with modifications -->
    <link href="css/custom.css" rel="stylesheet">

    <script src="js/respond.min.js"></script>

    <link rel="shortcut icon" href="favicon.png">





<c:if test="${pagedListHolder.pageCount > 1}">

	<ul class="pagination">
		<c:if test="${!pagedListHolder.firstPage}">
			<li class="previous">
				<a href="<%=StringUtils.replace(pagedLink, "~", String.valueOf(pagedListHolder.getPage() - 1)) %>"> Prev </a>
			</li>
		</c:if>
		
		<c:if test="${pagedListHolder.firstLinkedPage > 0} ">
			<li>	
				<a href="<%=StringUtils.replace(pagedLink, "~", "0") %>">1</a>
			</li>
		</c:if>
	
		<c:if test="${pagedListHolder.firstLinkedPage > 1} ">
			<li>	
				<span class="pagingDots">...</span>
			</li>
		</c:if>
		
		
		<c:forEach begin="${pagedListHolder.firstLinkedPage}" end="${pagedListHolder.lastLinkedPage}" var="i">
			<c:choose>
				<c:when test="${pagedListHolder.page == i}">
					<li class="active">
						<a href="#">${i+1}</a>
					</li>
				</c:when>
				<c:otherwise>
					<li>
						<a href="<%=StringUtils.replace(pagedLink, "~", String.valueOf(jspContext.getAttribute("i"))) %>">${i+1}</a>
					</li>
				</c:otherwise>
			</c:choose>
		
		</c:forEach>
		
		<c:if test="${pagedListHolder.lastLinkedPage < pagedListHolder.pageCount - 2}">
			<li>
				<span  class="pagingDots">...</span>
			</li>
		
		</c:if>
		
		<c:if test="${pagedListHolder.lastLinkedPage < pagedListHolder.pageCount - 1}">
			<li>
				<a href="<%=StringUtils.replace(pagedLink, "~", String.valueOf(pagedListHolder.getPageCount() - 1)) %>">${pagedListHolder.pageCount}</a>
			</li>
		
		</c:if>
		
		<c:if test="${!pagedListHolder.lastPage}">
		<li class="next">
			<a href="<%=StringUtils.replace(pagedLink, "~", String.valueOf(pagedListHolder.getPage() + 1)) %>">Next</a>
		</li>
		</c:if>
	</ul>


</c:if>