// A demo application of the Best practices of MVVM and RoomDatabase 
// Viewmodel will only interact
with screens
// Viewmodel ->Repository-> Dao
// Viewmode have delete insert and all list of note (livedata)
//Repository has delete and insert fun() as suspend cause want to run these tasks on back thread 
// Observing the allnote var as its a live data and updating our list if got any change 
// Thankyou