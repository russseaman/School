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

