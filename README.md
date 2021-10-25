Tech Assessment
Revised:  10/20/21


Writers oftentimes struggle with writing bloc. Even the greatest stories can go untold if the writer never puts pen to paper. Every year there is a competition called NaNoWriMo where the challenge is for authors to write 50,000 words in the month of November. Many writers pick up this challenge only to quickly fall back into their old habits and produce very little. One of the best methods for encouraging authors to continue writing is a concept called gamification. This is where you essentially make a mini game out of the event to stimulate people into performing the action with more motivation. 

	The challenge here is that the application requires the writer to keep a running total of their work instead of a more organic approach. The expectation is to create a spring-boot application (i.e., a REST API) which performs the back-end operations. The API should have the ability accept the book object which will have the list of book(s), chapter(s) inside each book and records of word count for each chapter and ideally it should be submitted to the backend. You can use postman for achieving this.
Note: No front-end is required.

The writer needs to have the ability to:
Create new book(s)
Create new chapter(s) for the book(s)
Submit current word count for a chapter

Consider the following json object to try and understand how to design your database. This object (or a similar object of your design) should be accessible to the writer via a REST GET. 

{
    "_id": "61696bb79ce22880c6ea3ade",
    "books": [
      {
        "id": 0,
        "name": "Cool Book 1!",
        "datetimestamp": "2016-10-27T10:19:10 +05:00",
        "chapters": [
          {
            "id": 0,
            "name": "Letitia Mcmillan",
            "datetimestamp": "2019-11-05T11:44:14 +06:00",
            "records": [
              {
                "id": 0,
                "datetimestamp": "2020-01-25T09:34:26 +05:00",
                "wordCount": 37
              },
              {
                "id": 1,
                "datetimestamp": "2020-02-11T05:40:33 +06:00",
                "wordCount": 34
              },
              {
                "id": 2,
                "datetimestamp": "2020-08-29T02:54:15 +05:00",
                "wordCount": 240
              }
            ]
          },
          {
            "id": 1,
            "name": "Potts Gill",
            "datetimestamp": "2020-09-17T12:14:48 +05:00",
            "records": [
              {
                "id": 0,
                "datetimestamp": "2020-11-01T01:51:19 +06:00",
                "wordCount": 35
              },
              {
                "id": 1,
                "datetimestamp": "2020-11-14T03:55:40 +06:00",
                "wordCount": 26
              },
              {
                "id": 2,
                "datetimestamp": "2020-11-16T10:39:17 +05:00",
                "wordCount": 38
              }
            ]
          }
        ]
      },
      {
        "id": 1,
        "name": "Cool Book 2",
        "datetimestamp": "2016-12-17T08:00:15 +06:00",
        "chapters": [
          {
            "id": 0,
            "name": "Vera Munoz",
            "datetimestamp": "2017-04-04T07:44:29 +05:00",
            "records": [
              {
                "id": 0,
                "datetimestamp": "2017-07-10T04:10:08 +05:00",
                "wordCount": 27
              },
              {
                "id": 1,
                "datetimestamp": "2017-12-23T08:52:29 +06:00",
                "wordCount": 33
              },
              {
                "id": 2,
                "datetimestamp": "2018-06-06T02:50:32 +05:00",
                "wordCount": 360
              }
            ]
          },
          {
            "id": 1,
            "name": "Madelyn Solis",
            "datetimestamp": "2018-07-01T09:14:41 +05:00",
            "records": [
              {
                "id": 0,
                "datetimestamp": "2018-09-07T06:44:14 +05:00",
                "wordCount": 25
              },
              {
                "id": 1,
                "datetimestamp": "2019-05-18T10:09:08 +05:00",
                "wordCount": 34
              },
              {
                "id": 2,
                "datetimestamp": "2019-07-29T10:21:54 +05:00",
                "wordCount": 25
              }
            ]
          }
        ]
      }
    ]
  }

Note: You can use the current system time value for datetimestamp or you can even pass your own timestamp.

Every time when the user submits the book object using POST call, the response should contain the difference of word count between the two timestamps. That is, consider the follow example:
When a user submits the following object on Timestamp 1:
{
  B1 - NAME
    	C1 - NAME
      		WC: 500
    	C2 - NAME
      		WC: 200
  B2 - NAME
    	C1 - NAME
      		WC: 500
    	C2 - NAME
      		WC: 200
}

It should contain a response something like this,
{
  	Wow. You typed 1400 words on your first submission
}


When a user submits the following object on Timestamp 2:
{
  B1 - NAME
    	C1 - NAME
      		WC: 600 (+100 words)
    	C2 - NAME
      		WC: 100 (-100 words)
  B2 - NAME
    	C1 - NAME
      		WC: 700 (+200 words)
    	C2 - NAME
      		WC: 100 (-100 words)
}

It should contain a response something like this,

{
  	Wow. You typed 100 words in (current timestamp-previous timestamp) minutes
  	Average number of words between two timestamps? (100/current timestamp-previous timestamp)
}

Also make sure to handle negative values as well, that is, it is common to not type any extra words but delete certain words from a chapter in a book. Majority of your work will be in POST calls but there are some GET and PUT options that we expect you to complete. You can use any database of your choice (relational, NoSQL) but make sure that timestamps and word count differences must be coming from the database.

GET options:
The writer will need a way to query the database for all books.
The writer will need a way to query the database for all chapters of a specific book
The writer will need a way to get the word count of a specific chapter of a specific book

PUT options:
The writer would like the ability to edit a book’s title
The writer would like the ability to edit a chapter’s title
The writer would like the ability to edit the word count of a chapter for a certain point of time












Expectation on what your code should have:
Your application must communicate with your database using hibernate.
Your application must make use of Ehcache.
Your application must use proper DTO & Model objects.
Your application must have Spring Security – CORS enabled.
Your application must handle exceptions gracefully. 
Your application must have actuator.
Your application must use “intelligent” logging
Your application must have unit tests.
The minimal expectation is that your application should handle configurations in a local property file

Nice to have (bonus-points): 
A front-end screen which accomplishes the first part of the challenge
External Spring Cloud config
Component tests (end to end testing)
Mutation tests 
Circuit Breaker
