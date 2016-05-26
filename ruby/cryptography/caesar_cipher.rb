#!/usr/bin/env ruby


def codepoint_cipher(message, operator, offset)
    result = ''
    message.each_codepoint {|c| result += c.send(operator, offset).chr }
    result
end

def classic_cipher(message, operator, offset, max=26)
    count = 0
    alphabet = {}
    result = ''
    [*('a'..'z')].map { |c| alphabet[c] = count; alphabet[c.upcase] = count; alphabet[count] = c; count += 1 }
    message.each_char { |c| result += alphabet[(alphabet[c].send(operator, offset) % max)] if alphabet.key?(c) }
    result
end

message = 'Flee at once! We are discovered.'
offset = 11

puts codepoint_cipher(message, '+', offset)
puts codepoint_cipher(codepoint_cipher(message, '+', offset), '-', offset)

puts classic_cipher(message, '+', offset)
puts classic_cipher(classic_cipher(message, '+', offset), '-', offset)

