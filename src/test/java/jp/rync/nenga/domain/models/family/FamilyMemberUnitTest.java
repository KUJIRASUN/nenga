package jp.rync.nenga.domain.models.family;

import jp.rync.nenga.base.domain.models.EntityWithLongUnitTest;
import org.junit.jupiter.api.Test;

interface FamilyMemberUnitTest extends EntityWithLongUnitTest<FamilyMemberId, FamilyMember> {
    @Test
    default void getNameTest() {
        String expected = "太郎";
        String actual = generateTestInstance().getName();
        assertEqualsWithLogger(expected, actual);
    }
}