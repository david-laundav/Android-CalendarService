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

License
---
Licensed under the [Apache License, Version 2.0] (http://www.apache.org/licenses/LICENSE-2.0.html)

Authors
---
Created by David Laundav and contributed by Christian Orthmann.
