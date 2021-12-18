# SMARTPAY - Price Downloader

This application downloads prices from an api to be used by SmartPay.

# Assumptions:
- The program will run throughout the day
- Api quota is 1000 request within 24 hours
  
# Note
- Frequency variable in Config file can be tuned to meet quota needs
- No analysis were done on the prices but once downloaded it easily be retrieved for further use.

# How To Run:
- Navigate to root of program
- Run: sbt run

Results:
Downloaded prices will be found under resources in the file: prices.txt
