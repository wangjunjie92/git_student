if  redis.call('sismember',KEYS[2],KEYS[3]) == 1 then
	return 100 
else 
	local num = redis.call('decr',KEYS[1]) 
  	if num < 0  then
  		return 101
  	else
  		if redis.call('sadd',KEYS[2],KEYS[3]) == 1 then
  			return 200
  		else 
  			return 103
  		end
  	end
end

  