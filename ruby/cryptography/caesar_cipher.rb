#!/usr/bin/env ruby



def create_alphabet_map
    count = 0
    alphabet = {}
    [*('a'..'z')].map { |c| alphabet[c] = count; alphabet[c.upcase] = count; alphabet[count] = c; count += 1 }
    alphabet
end

def codepoint_cipher(message, operator, offset)
    message.codepoints.map { |c| c.send(operator, offset).chr }.join
end

def classic_cipher(message, operator, offset, max=26)
    alphabet = create_alphabet_map
    message.chars.map { |c| alphabet[(alphabet[c].send(operator, offset) % max)] if alphabet.key?(c) }.join
end

message = 'Flee at once! We are discovered.'
offset = 11

puts codepoint_cipher(message, '+', offset)
puts codepoint_cipher(codepoint_cipher(message, '+', offset), '-', offset)

puts classic_cipher(message, '+', offset)
puts classic_cipher(classic_cipher(message, '+', offset), '-', offset)

