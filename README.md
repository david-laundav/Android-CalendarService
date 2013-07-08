Calendar Service for Android
====

This Calendar Service is used for retrieving calendar events in a specified time range.

You can either copy the content to your own working directory, or export them to a .JAR file.

Please do not delete the references.

Basic use
---
For accessing the data, simply use CalendarService.readCalendar(class.this); 
this is the basic constructor which provides events for +/- 1 day time range in the calendar.

Please note that you can also simply use the context (instead of class.this) if you are, for instance, using fragments.

If you wish, you can also apply specific parameters based on the following constructor:

CalendarService.readCalendar(class.this, int days, int hours)

An example would look like the following:

CalendarService.readCalendar(class.this, 2, 5)

This would provide you +/- 2 days and +/- 5 hours respectively.

Constraints
---
Due to the [changes in the API in Android 4.0](http://android-developers.blogspot.dk/2011/10/ics-and-non-public-apis.html) (Ice Cream Sandwich), this service can only be utilised by using a different cursor for API 4.0+.
The cursor has been commented, but can simply be used by uncommenting the code block in the CalendarService.java class.

Credits
---
Thanks to [SLEEPLisNight](https://github.com/SLEEPLisNight) for finding a solution for the API 4.0 issue.

License
---
Licensed under the [Apache License, Version 2.0] (http://www.apache.org/licenses/LICENSE-2.0.html)

Authors
---
Created by David Laundav and contributed by Christian Orthmann.
