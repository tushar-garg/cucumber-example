$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/pioneer/Poineer_demo.feature");
formatter.feature({
  "id": "creative",
  "description": "In order to create a new creative\r\nI want to specify the fields for a new creative",
  "name": "Creative",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "User has a session and enough privilegies",
  "keyword": "Background",
  "line": 6,
  "type": "background"
});
formatter.step({
  "name": "user has a valid session with following details",
  "keyword": "Given ",
  "line": 7,
  "rows": [
    {
      "cells": [
        "attribute",
        "value"
      ],
      "line": 8
    },
    {
      "cells": [
        "username",
        "jbarnes"
      ],
      "line": 9
    },
    {
      "cells": [
        "password",
        "Test1234"
      ],
      "line": 10
    }
  ]
});
formatter.match({
  "location": "PioneerDemoSteps.userHasValidSession(DataTable)"
});
formatter.result({
  "duration": 163068821,
  "status": "passed"
});
formatter.scenario({
  "id": "creative;create-a-new-creative",
  "description": "",
  "name": "create a new Creative",
  "keyword": "Scenario",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "user is on creative search page",
  "keyword": "Given ",
  "line": 14
});
formatter.step({
  "name": "user gets an option to create a new creative",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "user clicks on new creative",
  "keyword": "When ",
  "line": 16
});
formatter.step({
  "name": "user enters following data in the fields",
  "keyword": "When ",
  "line": 17,
  "rows": [
    {
      "cells": [
        "attribute",
        "value"
      ],
      "line": 18
    },
    {
      "cells": [
        "Media Type",
        "Email"
      ],
      "line": 19
    },
    {
      "cells": [
        "Product",
        "productfour"
      ],
      "line": 20
    },
    {
      "cells": [
        "Show",
        "showFour"
      ],
      "line": 21
    },
    {
      "cells": [
        "Version",
        "024"
      ],
      "line": 22
    },
    {
      "cells": [
        "Allowable",
        "1001"
      ],
      "line": 23
    },
    {
      "cells": [
        "Product Abbr",
        "PdenFour"
      ],
      "line": 24
    },
    {
      "cells": [
        "Show abbr",
        "SdenFour"
      ],
      "line": 25
    }
  ]
});
formatter.step({
  "name": "user save the data",
  "keyword": "When ",
  "line": 26
});
formatter.step({
  "name": "user gets a success message",
  "keyword": "Then ",
  "line": 27
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "Then ",
  "line": 28
});
formatter.match({
  "location": "PioneerDemoSteps.userOnCreativeSearchPage()"
});
formatter.result({
  "duration": 53371,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userGetsOptionToCreateNewCreative()"
});
formatter.result({
  "duration": 39003,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userClicksOnNewCreative()"
});
formatter.result({
  "duration": 39003,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userEntersDataInField(DataTable)"
});
formatter.result({
  "duration": 114543,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userSavesTheData()"
});
formatter.result({
  "duration": 44339,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userGetsSuccessMessage()"
});
formatter.result({
  "duration": 40644,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userClosesBrowser()"
});
formatter.result({
  "duration": 23812,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "User has a session and enough privilegies",
  "keyword": "Background",
  "line": 6,
  "type": "background"
});
formatter.step({
  "name": "user has a valid session with following details",
  "keyword": "Given ",
  "line": 7,
  "rows": [
    {
      "cells": [
        "attribute",
        "value"
      ],
      "line": 8
    },
    {
      "cells": [
        "username",
        "jbarnes"
      ],
      "line": 9
    },
    {
      "cells": [
        "password",
        "Test1234"
      ],
      "line": 10
    }
  ]
});
formatter.match({
  "location": "PioneerDemoSteps.userHasValidSession(DataTable)"
});
formatter.result({
  "duration": 104690,
  "status": "passed"
});
formatter.scenario({
  "id": "creative;create-a-new-creative---mandatory-fields-error-message",
  "description": "",
  "name": "create a new Creative - Mandatory fields Error message",
  "keyword": "Scenario",
  "line": 30,
  "type": "scenario"
});
formatter.step({
  "name": "user is on creative search page",
  "keyword": "Given ",
  "line": 31
});
formatter.step({
  "name": "user gets an option to create a new creative",
  "keyword": "Then ",
  "line": 32
});
formatter.step({
  "name": "user clicks on new creative",
  "keyword": "When ",
  "line": 33
});
formatter.step({
  "name": "user save the data",
  "keyword": "When ",
  "line": 34
});
formatter.step({
  "name": "user gets error messages for mandatory fields",
  "keyword": "Then ",
  "line": 35
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "Then ",
  "line": 36
});
formatter.match({
  "location": "PioneerDemoSteps.userOnCreativeSearchPage()"
});
formatter.result({
  "duration": 66098,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userGetsOptionToCreateNewCreative()"
});
formatter.result({
  "duration": 90731,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userClicksOnNewCreative()"
});
formatter.result({
  "duration": 63224,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userSavesTheData()"
});
formatter.result({
  "duration": 46803,
  "status": "passed"
});
formatter.match({
  "location": "PioneerDemoSteps.userGetsErrorMessagesForMandatoryFields()"
});
formatter.result({
  "duration": 15075358,
  "status": "failed",
  "error_message": "java.lang.NullPointerException\r\n\tat com.pioneer.PioneerDemoSeleniumSteps.verifyErrorMessages(PioneerDemoSeleniumSteps.java:111)\r\n\tat com.pioneer.PioneerDemoSteps.userGetsErrorMessagesForMandatoryFields(PioneerDemoSteps.java:61)\r\n\tat ✽.Then user gets error messages for mandatory fields(com/pioneer/Poineer_demo.feature:35)\r\n"
});
formatter.match({
  "location": "PioneerDemoSteps.userClosesBrowser()"
});
formatter.result({
  "status": "skipped"
});
});