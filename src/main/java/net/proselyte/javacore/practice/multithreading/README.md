## Multithreading
### Task
Implement application that accepts files and defines the extension and the size of each file.
* Each file is processed in a separate thread;
* simultaneous processing of not more than 4 files is allowed;
* if the number of files is larger, the remaining files must be queued;
* the first released thread must begin processing.