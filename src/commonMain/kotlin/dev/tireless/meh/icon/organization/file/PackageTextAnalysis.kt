package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PackageTextAnalysis: ImageVector
    get() {
        val current = _packageTextAnalysis
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PackageTextAnalysis",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="6" height="2" x="13.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 22
                moveTo(x = 13.0f, y = 22.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M2 18 v2 h2 v8 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 v-8 h2 v-2z m24 10 H6 v-8 h20z m3 -12 h-5 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h5 v2 h-5 v6 h5z M18 6 h-4 V2 h-2 v14 h6 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 m-4 8 V8 h4 v6z M8 6 H3 v2 h5 v2 H4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6 V8 a2 2 0 0 0 -2 -2 m0 8 H4 v-2 h4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m 24 10
                moveToRelative(dx = 24.0f, dy = 10.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 20z
                horizontalLineToRelative(dx = 20.0f)
                close()
                // m 3 -12
                moveToRelative(dx = 3.0f, dy = -12.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
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
                // m -4 8
                moveToRelative(dx = -4.0f, dy = 8.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 8
                verticalLineTo(y = 8.0f)
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
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _packageTextAnalysis = it }
    }

@Suppress("ObjectPropertyName")
private var _packageTextAnalysis: ImageVector? = null
