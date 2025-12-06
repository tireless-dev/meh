package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileAudio: ImageVector
    get() {
        val current = _mobileAudio
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MobileAudio",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="3" x="28.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 12
                moveTo(x = 28.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="13" x="24.0" y="7.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 7
                moveTo(x = 24.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="5" x="20.0" y="11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="9" x="16.0" y="9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="3" x="12.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <circle cx="13.5" cy="24.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13.5 24.5
                moveTo(x = 13.5f, y = 24.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20 30 H7 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h13 v2 H7 v24 h13 v-4 h2 v4 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 30
                moveTo(x = 20.0f, y = 30.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _mobileAudio = it }
    }

@Suppress("ObjectPropertyName")
private var _mobileAudio: ImageVector? = null
