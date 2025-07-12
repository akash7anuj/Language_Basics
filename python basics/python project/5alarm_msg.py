import time

def alarm_clock():
    alarm_time = input("Enter the time to set the alarm (HH:MM): ")
    alarm_hour, alarm_minute = map(int, alarm_time.split(':'))
    
    while True:
        current_time = time.localtime()
        current_hour = current_time.tm_hour
        current_minute = current_time.tm_min
        
        if current_hour == alarm_hour and current_minute == alarm_minute:
            print("Alarm! Time to wake up!")
            break
        time.sleep(30)

alarm_clock()
