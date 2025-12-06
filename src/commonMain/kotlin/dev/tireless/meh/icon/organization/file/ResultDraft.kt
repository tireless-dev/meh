package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ResultDraft: ImageVector
    get() {
        val current = _resultDraft
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ResultDraft",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.7 19.3 -3 -3 c-.4 -.4 -1 -.4 -1.4 0 L16 25.6 V30 h4.4 l9.3 -9.3 c.4 -.4 .4 -1 0 -1.4 M19.6 28 H18 v-1.6 l5 -5 1.6 1.6z m6.4 -6.4 L24.4 20 l1.6 -1.6 1.6 1.6z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.7 19.3
                moveTo(x = 29.7f, y = 19.3f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // c -0.4 -0.4 -1 -0.4 -1.4 0
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = -0.4f,
                    dx2 = -1.0f,
                    dy2 = -0.4f,
                    dx3 = -1.4f,
                    dy3 = 0.0f,
                )
                // L 16 25.6
                lineTo(x = 16.0f, y = 25.6f)
                // V 30
                verticalLineTo(y = 30.0f)
                // h 4.4
                horizontalLineToRelative(dx = 4.4f)
                // l 9.3 -9.3
                lineToRelative(dx = 9.3f, dy = -9.3f)
                // c 0.4 -0.4 0.4 -1 0 -1.4
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = -0.4f,
                    dx2 = 0.4f,
                    dy2 = -1.0f,
                    dx3 = 0.0f,
                    dy3 = -1.4f,
                )
                // M 19.6 28
                moveTo(x = 19.6f, y = 28.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v -1.6
                verticalLineToRelative(dy = -1.6f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l 1.6 1.6z
                lineToRelative(dx = 1.6f, dy = 1.6f)
                close()
                // m 6.4 -6.4
                moveToRelative(dx = 6.4f, dy = -6.4f)
                // L 24.4 20
                lineTo(x = 24.4f, y = 20.0f)
                // l 1.6 -1.6
                lineToRelative(dx = 1.6f, dy = -1.6f)
                // l 1.6 1.6z
                lineToRelative(dx = 1.6f, dy = 1.6f)
                close()
            }
            // <rect width="2" height="2" x="10.0" y="23.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 23
                moveTo(x = 10.0f, y = 23.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="4" height="2" x="14.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 18
                moveTo(x = 14.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="2" height="2" x="10.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="8" height="2" x="14.0" y="13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 13
                moveTo(x = 14.0f, y = 13.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="2" height="2" x="10.0" y="13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M7 28 V7 h3 v3 h12 V7 h3 v6 h2 V7 a2 2 0 0 0 -2 -2 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h5 v-2z m5 -24 h8 v4 h-8z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 28
                moveTo(x = 7.0f, y = 28.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m 5 -24
                moveToRelative(dx = 5.0f, dy = -24.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
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
        }.build().also { _resultDraft = it }
    }

@Suppress("ObjectPropertyName")
private var _resultDraft: ImageVector? = null
