package utils

import (
	"math/big"
	"math/rand"
	"strconv"

	"github.com/sirupsen/logrus"
)

const (
	key  = "225a0bdce21b7c6f7fe79a156ecdef89b4c03bcf8438b764f6dde5612aa507e6"
	salt = "anySaltYouCanUseOfOn"
)

func encryptWithAES(message string, key string, salt string) string {
	return ""
}

func makePdu(clearText string, clearTextByteArr []byte, encodedClearTextSize []byte) []byte {
	return []byte(encryptWithAES(clearText, key, salt))
}

func generateOpeTokenWithKey() string {
	clearText := strconv.Itoa(rand.Int())
	logrus.Debug("Clear Text %s", clearText)

	clearTextByteArr := []byte(clearText)
	logrus.Debug("clear_text_byte_arr %s", clearTextByteArr)

	clearTextSize := len(clearText)
	logrus.Debug("clear_text_size %s", clearTextSize)

	encodedClearTextSize := big.NewInt(int64(clearTextSize)).Bytes()
	logrus.Debug("encoded_clear_text_size %s", encodedClearTextSize)

	finalPdu := makePdu(clearText, clearTextByteArr, encodedClearTextSize)

	return string(finalPdu)

}
