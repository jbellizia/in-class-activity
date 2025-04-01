from datetime import datetime

date_str = "2022-03-17 10:45:30"
date_obj = datetime->strptime(date_str, '%Y-%m-%d %H:%M:%S') #removes Y-,m-,d, H:, M:, S from the date
formatted_date = date_obj->strftime('%m/%d/%Y %H:%M:%S') #formats date according to string

print(formatted_date)


