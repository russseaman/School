x= c("CBS", "Fox", "ABC", "Fox", "CBS", "CBS", "ABC", "Fox", "CBS", "ABC", "CBS", "CBS", "NBC", "CBS", "NBC", "NBC", "CBS", "CBS", "NBC", "NBC")


#Simple Pie chart

Ftable = table(x)
class = sort(unique(x))
pie(Ftable, label = class, main = "Pie Chart of Top broadcast shows")

pct <- round(Ftable/sum(Ftable)*100)
class <- paste(class, pct)
class <- paste(class, "%", sep="")
pie(Ftable, lables = class, col = rainbow(length(class)), main = "Pie Chart of the Top Broadcast Shows")

barplot(Ftable, main="Top Broadcast Shows", xlab ="Type of Broadcast shows")

barplot(Ftable, ylim=c(0,max(Ftable) + 5), main="Top Broadcast Shows", xlab ="Type of Broadcast shows")

relF = Ftable/sum(Ftable)

barplot(relF,ylim = c(0, max(relF) + .05), main = "Top Broadcast shows", xlab = "Type of Broadcast Shows")

xx = c( 44, 32, 35, 38, 35, 39, 42, 36, 36, 40, 51, 58, 58, 62, 63, 72, 78, 81, 25, 84, 20)

nclass = 5
Range = max(xx)-min(xx)
cwidth = ceiling(Range/nclass)

bins = seq(min(xx) - 0.5, max(xx) + 0.5,by=cwidth)

xxx = cut(xx,bins)

freq_table = table(xxx)

transform(freq_table)

cbind(freq_table, Rel_Freq.table(table(xxx)), Cum_Freq = cumsum(table(xxx)))

hist(xx)

x= c("CBS", "Fox", "ABC", "Fox", "CBS", "CBS", "ABC", "Fox", "CBS", "ABC", "CBS", "CBS", "NBC", "CBS", "NBC", "NBC", "CBS", "CBS", "NBC", "NBC")


#Simple Pie chart

Ftable = table(x)
class = sort(unique(x))
pie(Ftable, label = class, main = "Pie Chart of Top broadcast shows")

pct <- round(Ftable/sum(Ftable)*100)
class <- paste(class, pct)
class <- paste(class, "%", sep="")
pie(Ftable, lables = class, col = rainbow(length(class)), main = "Pie Chart of the Top Broadcast Shows")

barplot(Ftable, main="Top Broadcast Shows", xlab ="Type of Broadcast shows")

barplot(Ftable, ylim=c(0,max(Ftable) + 5), main="Top Broadcast Shows", xlab ="Type of Broadcast shows")

relF = Ftable/sum(Ftable)

barplot(relF,ylim = c(0, max(relF) + .05), main = "Top Broadcast shows", xlab = "Type of Broadcast Shows")

xx = c( 44, 32, 35, 38, 35, 39, 42, 36, 36, 40, 51, 58, 58, 62, 63, 72, 78, 81, 25, 84, 20)

nclass = 5
Range = max(xx)-min(xx)
cwidth = ceiling(Range/nclass)

bins = seq(min(xx) - 0.5, max(xx) + 0.5,by=cwidth)

xxx = cut(xx,bins)

freq_table = table(xxx)

transform(freq_table)

cbind(freq_table, Rel_Freq.table(table(xxx)), Cum_Freq = cumsum(table(xxx)))

hist(xx)

hist(xx,breaks=bins,main="sdsdsdsd",xlab="classes",col="red",ylim=c(0,15))

scores = c(75, 85, 90, 80,87,67,82,88,95, 91,73,80,83,92, 94,68,75, 91,79,95,87,	76,91,85)
stem(scores)

#### Dot Plot
sleepHr = c(7,  8,  5,  9,  9,  9, 7,  7,  10,  10,  11,  9,  8,  8,  8,  12,  6,  11,  10,  8,  8,   9,  9,  9,  8,  10,  9,  9,  8)

# Simple Dotplot

dotchart(sleepHr, cex=1, main="Hours sleeping for sixth graders when they have school", xlab="Number of Hrs sleep per night")

### Time Series Plot

pctvote = c(74.63, 72.48, 78.01, 65.97, 67.50)

#Tseries = ts(pctvote, start=c(1987,1),end=c(2000,1),frequency=1)
year = c(1984,1988,1992,1996,2000)

plot(year,pctvote,type='l')

###SCATTERPLOT

Age = c(22, 30, 25, 35, 65, 50, 27, 53, 42, 58)

DaysMiss = c(0, 4, 1, 2, 14, 7, 3, 8, 6, 4) 

plot(Age,DaysMiss, main = "Scatter plot of Days Missed vs Age", xlab = "Age", ylab = "Days Missed",     xlim = c(0,max(Age)+10), ylim = c(0,max(DaysMiss)+5), type = 'p')

