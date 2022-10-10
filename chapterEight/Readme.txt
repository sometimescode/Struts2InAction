Chapter Eight
Not sure about new pom dependencies, but it works for now.

Modified ajaxUserBrowser.js' toFinalConsole function from
    var portfolios = jsonObject.artist.portfolios.entry;
    var portfolioCount = portfolios.length;
    for ( var index = 0;  index < portfolioCount; index++ ) {
    	 var portfolio = portfolios[index];
       txt=document.createTextNode("Portfolio Name: " + portfolio['string']  );
       div = document.createElement("p");
       div.appendChild ( txt );
       console.appendChild(div);
    }
to:
	if(jsonObject.artist.portfolios.length == 1) {
		var portfolios = jsonObject.artist.portfolios[0];
		var portfolioCount = portfolios.entry.length;
		for ( var index = 0;  index < portfolioCount; index++ ) {
			 var portfolio = portfolios.entry[index];
		   txt=document.createTextNode("Portfolio Name: " + portfolio['string']  );
		   div = document.createElement("p");
		   div.appendChild ( txt );
		   console.appendChild(div);
		}
	}

Might be because of difference in dependency versions that affect the outputted jsonObject.

Note: In ajaxUserBrowser.js' onReadyState() function, it uses eval. Might be because JSON.parse was not available/common yet during this time.

In struts.xml added:
<constant name="struts.action.excludePattern" value="/anotherServlet"/>
in order for the redirect to work and not return an error.
https://stackoverflow.com/questions/5295491/how-to-use-servlet-in-struts2

Run into error messages when testing out functionality in:
8.3.1 VelocityResult, a.k.a. velocity (page 253/434 of pdf)
Referred to https://mvnrepository.com/artifact/org.apache.struts/struts2-plugins
And looked for the struts version that I used. Then I looked for velocity and the versions
used under the Versions column. Then copied the dependencies into pom.xml.