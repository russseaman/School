pcGDP = c(12.5, 12.2, 11.9, 12.0, 11.7, 11.5, 16.6, 15.4, 14.8, 14.5, 13.2, 12.9)
Tseries = ts(pcGDP, start=C(1997,1), end=c(2008,1)frequency=1)
plot(Tseries)
