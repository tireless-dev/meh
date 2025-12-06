package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentAttachment: ImageVector
    get() {
        val current = _documentAttachment
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DocumentAttachment",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 30 H11 a2 2 0 0 1 -2 -2 v-6 h2 v6 h15 V6 h-9 V4 h9 a2 2 0 0 1 2 2 v22 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 30
                moveTo(x = 26.0f, y = 30.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 22
                verticalLineToRelative(dy = 22.0f)
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
            // <rect width="7" height="2" x="17.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 10
                moveTo(x = 17.0f, y = 10.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="8" height="2" x="16.0" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 15
                moveTo(x = 16.0f, y = 15.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="9" height="2" x="15.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 20
                moveTo(x = 15.0f, y = 20.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -9z
                horizontalLineToRelative(dx = -9.0f)
                close()
            }
            // M9 19 a5 5 0 0 1 -5 -5 V3 h2 v11 a3 3 0 0 0 6 0 V5 a1 1 0 0 0 -2 0 v10 H8 V5 a3 3 0 0 1 6 0 v9 a5 5 0 0 1 -5 5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // a 3 3 0 0 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 0 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 3 3 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
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
        }.build().also { _documentAttachment = it }
    }

@Suppress("ObjectPropertyName")
private var _documentAttachment: ImageVector? = null
